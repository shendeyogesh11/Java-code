package employee_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeOperations {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_management",
                    "root",
                    "Yogesh.@0059"
            );

            String insertQuery = "INSERT INTO employee VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(insertQuery);

            Scanner sc = new Scanner(System.in);
            boolean running = true;

            while (running) {

                System.out.println("------------ MENU -------------");
                System.out.println(" 0. Exit");
                System.out.println(" 1. Add single employee");
                System.out.println(" 2. Add multiple employees");
                System.out.println(" 3. Update employee details");
                System.out.println(" 4. Delete employee");
                System.out.println(" 5. Display employee information");
                System.out.println(" 6. Statistics");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                int a;
                String b, d, e, f;
                double c;

                switch (choice) {

                    case 0:
                        System.out.println("Exiting program... Goodbye!");
                        running = false;
                        break;

                    case 1:
                        System.out.println("Enter employee Number");
                        a = sc.nextInt();
                        System.out.println("Enter employee Name");
                        b = sc.next();
                        System.out.println("Enter employee salary");
                        c = sc.nextDouble();
                        System.out.println("Enter employee dept");
                        d = sc.next();
                        System.out.println("Enter employee gender");
                        e = sc.next();
                        System.out.println("Enter employee dob (yyyy-mm-dd)");
                        f = sc.next();

                        ps.setInt(1, a);
                        ps.setString(2, b);
                        ps.setDouble(3, c);
                        ps.setString(4, d);
                        ps.setString(5, e);
                        ps.setString(6, f);
                        ps.addBatch();
                        break;

                    case 2:
                        System.out.println("Enter number of employees to insert:");
                        int size = sc.nextInt();

                        for (int i = 1; i <= size; i++) {
                            System.out.println("Enter the " + i + "th employee details:");

                            System.out.println("Enter employee Number");
                            a = sc.nextInt();
                            System.out.println("Enter employee Name");
                            b = sc.next();
                            System.out.println("Enter employee salary");
                            c = sc.nextDouble();
                            System.out.println("Enter employee dept");
                            d = sc.next();
                            System.out.println("Enter employee gender");
                            e = sc.next();
                            System.out.println("Enter employee dob (yyyy-mm-dd)");
                            f = sc.next();

                            ps.setInt(1, a);
                            ps.setString(2, b);
                            ps.setDouble(3, c);
                            ps.setString(4, d);
                            ps.setString(5, e);
                            ps.setString(6, f);
                            ps.addBatch();
                        }
                        break;

                    case 3:
                        System.out.println("Enter employee number to update:");
                        int empNo = sc.nextInt();

                        System.out.println("What do you want to update?");
                        System.out.println("1. Name");
                        System.out.println("2. Department");
                        System.out.println("3. Salary");
                        int updateChoice = sc.nextInt();

                        PreparedStatement psUpdate = null;
                        switch (updateChoice) {
                            case 1:
                                System.out.println("Enter new Name:");
                                String newName = sc.next();
                                psUpdate = connection.prepareStatement("UPDATE employee SET ename=? WHERE eno=?");
                                psUpdate.setString(1, newName);
                                psUpdate.setInt(2, empNo);
                                break;

                            case 2:
                                System.out.println("Enter new Department:");
                                String newDept = sc.next();
                                psUpdate = connection.prepareStatement("UPDATE employee SET dept=? WHERE eno=?");
                                psUpdate.setString(1, newDept);
                                psUpdate.setInt(2, empNo);
                                break;

                            case 3:
                                System.out.println("Enter new Salary:");
                                double newSalary = sc.nextDouble();
                                psUpdate = connection.prepareStatement("UPDATE employee SET salary=? WHERE eno=?");
                                psUpdate.setDouble(1, newSalary);
                                psUpdate.setInt(2, empNo);
                                break;

                            default:
                                System.out.println("Invalid option!");
                                break;
                        }

                        if (psUpdate != null) {
                            int count = psUpdate.executeUpdate();
                            if (count > 0)
                                System.out.println("Record Updated Successfully");
                            else
                                System.out.println("Employee not found");
                        }
                        break;

                    case 4:
                        System.out.println("Enter employee number to delete:");
                        int delEmpNo = sc.nextInt();

                        PreparedStatement psDelete = connection.prepareStatement("DELETE FROM employee WHERE eno=?");
                        psDelete.setInt(1, delEmpNo);

                        int deleted = psDelete.executeUpdate();
                        if (deleted > 0)
                            System.out.println("Employee deleted successfully.");
                        else
                            System.out.println("Employee not found!");
                        break;

                    case 5:
                        System.out.println("------------ Display Menu ------------");
                        System.out.println("1. Single employee (by ID)");
                        System.out.println("2. Employees Dept-wise");
                        System.out.println("3. Employees Gender-wise");
                        System.out.println("4. Employees born after a given year");

                        int displayChoice = sc.nextInt();
                        PreparedStatement psDisp = null;
                        ResultSet rs = null;

                        switch (displayChoice) {

                            case 1:
                                System.out.println("Enter Employee Number : ");
                                int empId = sc.nextInt();
                                psDisp = connection.prepareStatement("SELECT * FROM employee WHERE eno=?");
                                psDisp.setInt(1, empId);
                                rs = psDisp.executeQuery();
                                if (rs.next()) printEmployee(rs);
                                else System.out.println("Employee not found!");
                                break;

                            case 2:
                                System.out.println("Enter Department Name:");
                                String dep = sc.next();
                                psDisp = connection.prepareStatement("SELECT * FROM employee WHERE dept=?");
                                psDisp.setString(1, dep);
                                rs = psDisp.executeQuery();

                                boolean foundDep = false;
                                while (rs.next()) {
                                    foundDep = true;
                                    printEmployee(rs);
                                }
                                if (!foundDep) System.out.println("No employees found in this department.");
                                break;

                            case 3:
                                System.out.println("Enter Gender (male/female): ");
                                String gen = sc.next();
                                psDisp = connection.prepareStatement("SELECT * FROM employee WHERE gender=?");
                                psDisp.setString(1, gen);
                                rs = psDisp.executeQuery();

                                boolean foundGen = false;
                                while (rs.next()) {
                                    foundGen = true;
                                    printEmployee(rs);
                                }
                                if (!foundGen) System.out.println("No employees found for this gender.");
                                break;

                            case 4:
                                System.out.println("Enter Year (YYYY) : ");
                                int year = sc.nextInt();
                                psDisp = connection.prepareStatement("SELECT * FROM employee WHERE YEAR(dob) > ?");
                                psDisp.setInt(1, year);
                                rs = psDisp.executeQuery();

                                boolean foundYear = false;
                                while (rs.next()) {
                                    foundYear = true;
                                    printEmployee(rs);
                                }
                                if (!foundYear) System.out.println("No employees born after " + year);
                                break;

                            default:
                                System.out.println("Invalid display choice!");
                        }
                        break;

                    case 6:
                        System.out.println("---------- Statistics Menu ----------");
                        System.out.println("1. Employee with Maximum Salary");
                        System.out.println("2. Employee with Maximum Age");

                        int statChoice = sc.nextInt();
                        PreparedStatement psStat = null;
                        ResultSet rsStat = null;

                        switch (statChoice) {
                            case 1:
                                psStat = connection.prepareStatement("SELECT * FROM employee ORDER BY salary DESC LIMIT 1");
                                rsStat = psStat.executeQuery();
                                if (rsStat.next()) {
                                    System.out.println("----- Employee With Maximum Salary -----");
                                    printEmployee(rsStat);
                                } else System.out.println("No records found.");
                                break;

                            case 2:
                                psStat = connection.prepareStatement("SELECT * FROM employee ORDER BY dob ASC LIMIT 1");
                                rsStat = psStat.executeQuery();
                                if (rsStat.next()) {
                                    System.out.println("----- Employee With Maximum Age (Oldest) -----");
                                    printEmployee(rsStat);
                                } else System.out.println("No records found.");
                                break;

                            default:
                                System.out.println("Invalid statistics option!");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Please enter valid input!");
                }

                if (choice == 1 || choice == 2) {
                    int rows[] = ps.executeBatch();
                    if (rows.length > 0)
                        System.out.println(rows.length + " Records Inserted");
                    else
                        System.out.println("No records inserted");
                }
            }

            ps.close();
            connection.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void printEmployee(ResultSet rs) throws Exception {
        System.out.println("ENO: " + rs.getInt(1)
                + " | Name: " + rs.getString(2)
                + " | Salary: " + rs.getDouble(3)
                + " | Dept: " + rs.getString(4)
                + " | Gender: " + rs.getString(5)
                + " | DOB: " + rs.getString(6));
    }
}
