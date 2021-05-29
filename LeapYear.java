import java.util.Scanner;
public class LeapYear 
{
   public static void main(String[] args)
   {
      int year;
      System.out.println("Enter an Year : ");
      try (Scanner sc = new Scanner(System.in)) {
		year = sc.nextInt();
	}
      if(year % 4 == 0)
	  {
		  System.out.println("Year is a Leap Year");
	  }
      else
	  {
		  System.out.println("Year is Not a Leap Year");
	  }
	  
   }
}