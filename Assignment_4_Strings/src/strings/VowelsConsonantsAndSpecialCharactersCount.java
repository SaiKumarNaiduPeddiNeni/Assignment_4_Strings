package strings;

import java.util.Scanner;

/*Enter the original string
!#$Learning full stack development from INEURON!!
Vowels count in the given string is: 14
consonants count in the given string is: 25
special Characters count in the given string is: 5*/


public class VowelsConsonantsAndSpecialCharactersCount {
	
	public static void main(String... strings) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the original string");
		String string=new String();
		string=scan.nextLine();
		int[] array=vowelsConsonantsAndSpecialCharactersCountcheck(string.toLowerCase());
		System.out.println("Vowels count in the given string is: "+array[0]);
		System.out.println("consonants count in the given string is: "+array[1]);
		System.out.println("special Characters count in the given string is: "+array[2]);
		scan.close();
	}
	
	static int[] vowelsConsonantsAndSpecialCharactersCountcheck(String string) {
		int[] count= new int[3];
		for(int i=0;i<string.length();i++) {
			char c=string.charAt(i);
			if(Character.isAlphabetic(c)) {
				if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
					count[0]++;
				}
				else
				{
					count[1]++;
				}
			}
			else if(!Character.isDigit(c) && !Character.isWhitespace(c)) {
				count[2]++;
			}
		}
		return count;
		
	}
	
	

}
