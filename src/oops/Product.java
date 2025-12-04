package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Product {
	private int id;
	private String title;
	private double price;
	private String description;
	private String category;
	
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public void inputProduct() throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the product id: ");
		this.id =Integer.parseInt(br.readLine());
		
		System.out.println("Enter the product title: ");
		this.title = br.readLine();
		
		System.out.println("Enter the product price: ");
		this.price =Double.parseDouble(br.readLine());
		
		System.out.println("Enter the product description: ");
		this.description =br.readLine();
		
		System.out.println("Enter the product category: ");
		this.category =br.readLine();
		
	}
	
	
        public void displayProduct(){
				
		System.out.println("The product id is: " + this.id);
		
		
		System.out.println("The product title is: " + this.title);
		
		
		System.out.println("The product price is: " + this.price);
		
		
		System.out.println("The product description is: " + this.description);
		
		
		System.out.println("Enter the product category is: " + this.category);
		
	}


		public boolean search(int searchId) {
			
			if(searchId == this.id) return true;
			else return false;
			// TODO Auto-generated method stub
		}
		
		
		
		

}
