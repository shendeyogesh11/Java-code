package com.dsa.app.assignments;

public class ToggleString {
	
	public static void main(String[] args) {
		
//		String str = "heLLO";
		String str = "Hello students Welcome TO strinG Session";
		
		toggleString(str);
		
	}

	private static void toggleString(String str) {
		
		String[] arr = str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		
		for(String word: arr) {
			
			char[] chars = word.toCharArray();
			
			if(Character.isLowerCase(word.charAt(0))) {
				
				chars[0] = (char) (chars[0] - 32);
			}
			
			int last = word.length()-1;
			
			if(Character.isLowerCase(word.charAt(last))) {
				
				chars[last] = (char) (chars[last] - 32);
			}
			
			sb.append(new String(chars)).append(" ");
			
//			char ch = str.charAt(i);
//			
//			if(Character.isUpperCase(ch)) {
//				
//				ch = (char) (ch + 32);
//			}
//			else {
//				ch = (char) (ch - 32);
//			}
//			
//			sb.append(ch);
		}
		
		System.out.println(sb);
		
	}

}
