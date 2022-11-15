package strings;

import java.util.Scanner;

/*Enter the original string
The quick brown fox jumps over the lazy dog
The given string is: Pangram

Enter the original string
A quick white fox jumps over the lazy dog 
The given string is: not pangram

*/

public class Pangram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the original string");
		String string = new String();
		string = scan.nextLine();
		System.out.println("The given string is: " + (pangramCheck(string)?"Pangram":"not pangram"));
		scan.close();
	}

	static boolean pangramCheck(String string) {
		int[] count = new int[26];
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) >= 65 && string.charAt(i) <= 90) {
				count[string.charAt(i) - 65]++;
			} else if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
				count[string.charAt(i) - 97]++;
			}
		}
		for (int i : count) {
			if (i == 0) {
				return false;
			}
		}

		return true;

	}

}
