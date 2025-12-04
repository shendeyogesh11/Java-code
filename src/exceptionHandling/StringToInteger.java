package exceptionHandling;

public class StringToInteger {
	public static void main(String[] args) {
		
		String sc = "my name is yogesh and i am 23 years old i have 1 brother and 2 sisters";
		
		String arr[] = sc.split(" ");
		int count=0;
		
		for(String word: arr) {
			
			try {
				int number = Integer.parseInt(word);
				count++;
			}
			catch(NumberFormatException e) {
				
			}
		}
		
		System.out.println("Numbers are " + count);
		
	}

}
