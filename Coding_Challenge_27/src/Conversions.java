import java.util.*;
public class Conversions 
{
	public static void main(String[] args) 
	{
		float cm,inch,m,km;
		int ch;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter length in Centimeter:- ");
		cm=input.nextInt();
		System.out.println("1. Centimeter to Inches.\n"+"2. Centimeter to Meter. \n"+"3.Centimeter to Kilometer.\n");
		System.out.print("Enter Your Choice:- ");
		ch=input.nextInt();
		switch(ch)
		{
			case 1:
			{
				inch=(float)(cm/2.54);
				System.out.println("Centimeter in inch is:- "+inch +" Ich");
				break;
			}
			case 2:
			{
				m=(float)(cm/100);
				System.out.println("Centimeter in Meter is:- "+m +" Meters");
				break;
			}
			case 3:
			{
				km=(float)(cm/100000);
				System.out.println("Centimeter in Kilometer is:- "+km +" Kilometer");
				break;
			}
			default:
			{
				System.out.println("You Entered Wrong Choice.");
				input.close();
				System.exit(0);
				break;
			}
			
		
		}
		input.close();
		System.exit(0);

	}

}
