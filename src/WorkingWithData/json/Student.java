package WorkingWithData.json;

//import java.util.Comparator;

public class Student {
	
	private int roll;
	private String sname;
	private double per;
	
   public Student() {}

	public Student(int roll, String sname, double per) {
		super();
		this.roll = roll;
		this.sname = sname;
		this.per = per;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", sname=" + sname + ", per=" + per + "]";
	}

//	@Override
//	public int compare(Student o1, Student o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public int compareTo(Student o) {
//		
//		if(this.roll > o.roll) {
//			return 1;
//		}
//		else if(this.roll < o.roll) {
//			return -1;
//		}
//		
//		return 0;
//	}
   
	
	
   
	

}
