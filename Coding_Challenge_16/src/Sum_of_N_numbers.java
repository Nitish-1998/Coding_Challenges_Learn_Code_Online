import java.util.*;

public class Sum_of_N_numbers 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter the number:-");
		n=input.nextInt();
		while(n>0) 
		{
			int rem=n%10;
			System.out.println(rem);
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum Is :- "+sum);
		System.exit(0);
		input.close();

	}

}
