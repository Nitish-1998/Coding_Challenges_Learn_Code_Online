import java.util.*;
public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		float timeSecond;
		float kph,mph;
		System.out.println("Input distance in meter:- ");
		float distance=input.nextInt();
		System.out.println("Input Hour:- ");
		float hr=input.nextFloat();
		System.out.println("Input Minutes:- ");
		float min=input.nextFloat();
		System.out.println("Input seconds:- ");
		float sec=input.nextFloat();
		timeSecond=(hr*3600)+(min*60)+sec;
		kph=(distance/1000.0f)/(timeSecond/3600.0f);
		mph=kph/1.609f;
		System.out.println("Your Speed In Miles/h is "+mph);
		input.close();
		System.exit(0);

	}

}
