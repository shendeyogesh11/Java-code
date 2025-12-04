package oops;

import java.io.IOException;

public class ArrayOfObjects {
	public static void main(String[] args) throws IOException  {
		Product p[] = new Product[3];
		Product maxProduct = null;
		
		for(int i=0; i<p.length; i++) {
			p[i] = new Product();
			p[i].inputProduct();
		}
		
		for(int i=0; i<p.length; i++) {
			p[i].displayProduct();
		}
		
//		boolean ans = false;
//		for(int i=0; i<p.length; i++) {
//			ans = p[i].search(5);
//		}
//		
//		if(ans) {
//			System.out.println("Found");
//		}else {
//			System.out.println("Not Found");
//		}
		
		
		
//		double max=-1;
//		for(int i=0; i<p.length; i++) {
//			
//			if(p[i].getPrice() > max ) {
//				max = p[i].getPrice();
//				maxProduct = p[i];
//			}
//			
//		}
		
		
		double max=-1;
		for(Product product: p) {
			
			if(product.getPrice() > max ) {
				max = product.getPrice();
				maxProduct = product;
			}
			
		}
		
		
		System.out.println(" costiest product price is : " + maxProduct.getPrice() + " Title is: "+ maxProduct.getTitle() + " category is: " + maxProduct.getCategory());
		
		
//		Product temp=null;
//		
//		for(int i=0; i<p.length;i++) {
//			for(int j=i+1; j<p.length; j++) {
//				
//				if(p[i].getPrice() > p[j].getPrice()) {
//					temp = p[i];
//					p[i] = p[j];
//					p[j] = temp;
//				}
//			}
//		}
//		
//		System.out.println("ascending in sorted price");
//		for(int i=0; i<p.length; i++) {
//			p[i].displayProduct();
//		}
		
       Product temp=null;
		
		for(int i=0; i<p.length;i++) {
			for(int j=i+1; j<p.length; j++) {
				
				if(p[i].getTitle().compareTo(p[j].getTitle()) > 0) {
					temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
		
		System.out.println("ascending in sorted title");
		for(int i=0; i<p.length; i++) {
			p[i].displayProduct();
		}
		
	}

}
