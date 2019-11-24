import java.util.*;
public class Leap_Year 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int year;
		System.out.println("Enter the year:- ");
		year=input.nextInt();
		if(year%4==0||year%400==0)
		{
			System.out.println(year +" is Leap year");
		}
		else
		{
			System.out.println("Not a leap year ");
		}
		input.close();
		System.exit(0);

	}

}
