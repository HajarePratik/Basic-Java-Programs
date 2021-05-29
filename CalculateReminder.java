import java.util.Scanner;
public class CalculateReminder 
{

	public static void main(String[] args) 
	{
		int dividend;
		int divisor;
		System.out.println("Enter The First Number :");
		Scanner sc = new Scanner(System.in);
		dividend=sc.nextInt();
		System.out.println("Enter The Second Number :");
		divisor=sc.nextInt();
		
		int q = dividend / divisor;
        int r = dividend % divisor;
		System.out.println("Quotient is: "+ q);
		System.out.println("Remainder is: "+ r);
	}

}