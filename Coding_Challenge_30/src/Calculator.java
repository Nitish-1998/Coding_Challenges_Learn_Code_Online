import java.util.*;
public class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first Digit:-  ");
		int f=input.nextInt();
		System.out.println("Enter the Second  Digit:- ");
		int s=input.nextInt();
		System.out.println("1. Sum\n"+"2. Difference \n"+"3. Product \n"+"4. Average \n"+"5. Maximum \n"+"6. Minimum \n");
		System.out.println("Enter Your Choice:- ");
		int ch=input.nextInt();
		switch(ch)
		{
			case 1:
			{
				int c=f+s;
				System.out.println("The Sum is :- "+c);
				break;
				
			}
			case 2:
			{
				int d;
					d=f-s;
					System.out.println("The Difference Is:-  "+d);
				break;
			}
			case 3:
			{
				int p=f*s;
				System.out.println("The Product Is :- "+p);
				break;
			}
			case 4:
			{
				float a=(float)((f+s)/2);
				System.out.println("The Average is:- "+a);
				break;
				
			}
			case 5:
			{
				if(f>s)
				{
					System.out.println("The Maximum is:- "+f);
				}
				else
				{
					System.out.println("The Maximum is:- "+s);
				}
				break;
			}
			case 6:
			{
				if(f<s)
				{
					System.out.println("The Minimum Is:- "+f);
				}
				else
				{
					System.out.println("The Minimum Is:- "+s);
				}
				break;
			}
			default :
			{
				System.out.println("Invalid Choice Please Enter the valid Choice.");
			}
			
	   }
		input.close();
		System.exit(0);

	}
}
