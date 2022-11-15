package strings;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringUnique {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the original string");
		String string=new String();
		string=scan.nextLine();
		System.out.println("The given string is "+(stringUniqueCheck(string)?"Unique":"not unique"));
		scan.close();

	}
	static boolean stringUniqueCheck(String string) {
		Set<Character> set = new TreeSet<Character>();
		for(int i=0;i<string.length();i++) {
			set.add(string.charAt(i));
		}
		if(set.size()==string.length()) {
			return true;
		}
		return false;
		
	}

}
