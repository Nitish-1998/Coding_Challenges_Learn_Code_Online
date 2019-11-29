import java.util.*;
public class Speed_Display 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int m,h, min,s;
		float kph,mph;
		System.out.println("Enter the Distance in Meters:- ");
		m=input.nextInt();
		System.out.println("Enter the Hours:- ");
		h=input.nextInt();
		System.out.println("Enter the Mins:-");
		min=input.nextInt();
		System.out.println("Enter the Seconds:- ");
		s=input.nextInt();
		float totalSeconds=(h*3600)+(min*60)+s;
		kph=(m/1000.0f)/(totalSeconds/3600);
		mph=kph/1.609f;
	
	     System.out.println("Total Distance in Miles Per Hour:- "+mph +"Miles/Hours");
	     input.close();
	     System.exit(0);
	}

}
