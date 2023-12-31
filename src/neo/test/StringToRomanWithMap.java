package neo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringToRomanWithMap {

	public static int StringToRoman(String str) {
		String str1 = str.toUpperCase();
		
		Map<Character,Integer> romanMap = new HashMap<>(); 
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		
		int result = 0;
		for(int i=0; i<=str.length()-1;i++) {
			result = result + romanMap.get(str1.charAt(i));
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter string ::");
			String str = sc.nextLine();
			
			int romanNumberAddition = StringToRomanWithMap.StringToRoman(str);
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

