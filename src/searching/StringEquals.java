package searching;

public class StringEquals {
	public static void main(String[] args) {
		
		String[] arr = {"kunal","shivam","sai","prathmesh","rushi"};
		String target = "kunal";
		boolean flag  = false;
		
		for(int i=0; i<arr.length; i++) {
			if(target.equals(arr[i])) {
				flag = true;
				System.out.println("found at index: "+ i);
				break;
			}
		}
		
		if(!flag) {
			System.out.println("Not Found");
		}
	}

}
