package strings;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElementsInStrings {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the original string");
		String s=new String();
		s=scan.nextLine();
		System.out.println("Duplicates in a string");
		System.out.println(duplicates(s));
		scan.close();
	}
	
	static String duplicates(String s) {
		String duplicates="";
		Set<Character> set = new TreeSet<>();
		for(int i=0;i<s.length();i++) {
			if(!set.add(s.charAt(i))) {
				duplicates+=s.charAt(i);
			}
		}
		return duplicates;
		
	}

}
