package com.app.neo;

import java.util.Scanner;

public class RomanStringClass {
	
	public static int getRomanValue(char ch1) {
		char ch = Character.toUpperCase(ch1);
			if(ch == 'I')
				return 1;
		    else if(ch == 'V')
				return 5;
		    else if(ch == 'X')
		    	return 10;
		    else if(ch == 'L')
		    	return 50;
		    else if(ch == 'C')
		    	return 100;
		    else if(ch == 'D')
		    	return 500;
		    else if(ch == 'M')
		    	return 1000;
		return 0;
		
	}
	
	public static int getRomanNumber(String str) {
		int result = 0;
	
		for(int i=0; i<str.length(); i++) {
			result = result+ getRomanValue(str.charAt(i));
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter string ::");
			String str = sc.nextLine();
			
			int romanNumberAddition = RomanStringClass.getRomanNumber(str);
			System.out.println("Roman Number ::"+romanNumberAddition);
			System.out.print("Do you want to continue? (yes/no): ");
	        String response = sc.nextLine().toLowerCase();
			
			if (!response.equals("yes")) {
	            break;
	        }
		
		} while(true); 
		sc.close();
	}

}
