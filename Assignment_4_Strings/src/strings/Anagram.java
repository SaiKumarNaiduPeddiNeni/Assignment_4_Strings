package strings;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string1");
		String string1=scan.nextLine();
		System.out.println("Enter the string2");
		String string2=scan.nextLine();
		System.out.println("The given string is: " + (anagramCheck(string1, string2)?"anagram":"not anagram"));
		scan.close();
	}
	
	static boolean anagramCheck(String string1,String string2) {
		if(string1.length()!=string2.length()) {
			return false;
		}
		for(int i=0;i<string1.length();i++) {
			if(string2.indexOf(string1.charAt(i))==-1) {
				return false;
			}
		}
		
		return true;
		
	}

}
