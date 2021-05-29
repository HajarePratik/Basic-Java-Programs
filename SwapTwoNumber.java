public class SwapTwoNumber
{
	public static void main(String args[])
	{
		int a=10,b=20,temp=0;
		
		System.out.println("Before Swapping:");
		System.out.println("Taking Value is A :"+a);
		System.out.println("Taking Value is B :"+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping:");
		System.out.println("Value is A :"+a);
		System.out.println("Value is B :"+b);
		
	}
}