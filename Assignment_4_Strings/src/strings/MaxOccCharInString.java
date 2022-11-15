package strings;

import java.util.Scanner;

public class MaxOccCharInString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the original string");
		String string=new String();
		string=scan.nextLine();
		if(!string.isEmpty()) {
			System.out.println("Max occurance char in the given string is: "+maxOccCharInStringCheck(string));
		}
		else {
			System.out.println("given string is empty");
		}
		
		scan.close();

	}
	
	static char maxOccCharInStringCheck(String string) {
		int max=-1;
		char maxChar=' ';
		int[] charFrequency=new int[256];
		for(int i=0;i<string.length();i++) {
			charFrequency[string.charAt(i)]++;
		}
		for(int i=0;i<string.length();i++) {
			if(max<charFrequency[string.charAt(i)]) {
				max=charFrequency[string.charAt(i)];
				maxChar=string.charAt(i);
			}
		}
		return maxChar;
		
	}

}
