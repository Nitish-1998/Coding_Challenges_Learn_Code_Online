import java.util.*;
public class Temperature_Conversion 
{
	public static void main(String[] args) 
	{
		 float c,f;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the Temperature in Celcius:- ");
		c=input.nextFloat();
		f=(float)((c*9/5)+32);
		System.out.println("Temperature in Fahrenheit is:- "+f+"F");
		input.close();
		System.exit(0);
	

	}

}
