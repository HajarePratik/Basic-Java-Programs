import java.util.Scanner;
public class PowerofTwo
{
	public static void main(String args[])
	{
		int a,power,temp=1;
		System.out.println("Enter a Number");
		try (Scanner sc = new Scanner(System.in))
		{
			a = sc.nextInt();
			power = sc.nextInt();
		}
		for(int i=1;i<=power; i++)
		{
			temp = temp * a;
		}
		System.out.println("The Power of Number Is :" +temp);
	}
}