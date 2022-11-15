package strings;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemovingDuplicatesInString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the original string");
		String s=new String();
		s=scan.nextLine();
		System.out.println("String without Duplicates");
		System.out.println(removingDuplicates(s));
		scan.close();

	}
	
	static String removingDuplicates(String s) {
		String unique="";
		Set<Character> set = new TreeSet<>();
		for(int i=0;i<s.length();i++) {
			if(set.add(s.charAt(i))) {
				unique+=s.charAt(i);
			}
		}
		return unique;
		
	}

}
