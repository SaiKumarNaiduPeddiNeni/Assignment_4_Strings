package strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the original string");
		String string=new String();
		string=scan.nextLine();
		System.out.println("Given string is"+(palindromeCheck(string)?" palindrome":" not palindrome"));
		scan.close();
	}
	
	static boolean palindromeCheck(String string) {
		for(int i=0;i<(string.length()/2);i++) {
			if(string.charAt(i)!=string.charAt(string.length()-i-1) ) {
				return false;
			}
		}
		return true;
	}
}