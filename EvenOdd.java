import java.util.Scanner;

class EvenOdd
{
	  public static void main(String args[])
	  {
			int num;
			System.out.println("Enter a number:");

			try (Scanner sc = new Scanner(System.in)) {
				num = sc.nextInt();
			}
			if ( num % 2 == 0 )
			{
				System.out.println("Number Is Even");
			}
			else
			{
				System.out.println("Number is Odd"); 
			}
			
	  }
}