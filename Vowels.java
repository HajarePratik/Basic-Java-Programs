import java.util.Scanner;

public class Vowels
 {
		public static void main(String args[])
	   {
			  System.out.println("Enter a Character :");
			 
			  try (Scanner sc = new Scanner(System.in)) {
				char ch = sc.next().charAt(0);
				  
				  if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u')
				  {
						System.out.println("Given character is an Vowel");
				  }
				  else
				  {
						System.out.println("Given character is a Consonant");
				  }
			}
	   }
 }