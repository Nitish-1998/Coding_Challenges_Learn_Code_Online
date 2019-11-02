import java.util.*;
public class multiplication 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int c;
		System.out.println("Enter the choice: ");
		c=input.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(c +"*" + i + "= " +c*i);
		}
		input.close();

	}

}
