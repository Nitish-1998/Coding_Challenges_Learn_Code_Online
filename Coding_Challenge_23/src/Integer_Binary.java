import java.util.*;
public class Integer_Binary 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n;
		String x="";
		System.out.println("Enter the number you want to conver into Binary:- ");
		n=input.nextInt();
		while(n>0)
		{
			int a=n%2;
			x=a+x;
			n=n/2;
		}
		System.out.println("Binary Digit is:- "+x);
		input.close();
		System.exit(0);

	}

}
