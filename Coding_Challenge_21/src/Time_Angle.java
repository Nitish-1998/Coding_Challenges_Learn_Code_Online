import java.util.*;
public class Time_Angle 
{
	static int calcAngle(double h,double m)
	{
		if(h<0||m<0||h>12||m>60)
		{
			System.out.println("Wrong input");
		}
		if(h==12)
		{
			h=0;
		}
		if(m==60)
		{
			m=0;
		}
		
		int hour_angle=(int)(0.5*(h*60+m));
		System.out.println(hour_angle);
		int minute_angle=(int)(6*m);
		System.out.println(minute_angle);
		int angle=Math.abs(hour_angle-minute_angle);
		System.out.println(angle);
		angle=Math.min(360-angle, angle);
		System.out.println(angle);
		
		return angle;
	}
	public static void main(String[] args) 
	{
		int hour,minute;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter hour (1-12)..");
		hour=input.nextInt();
		System.out.println("Enter minute (0-59)");
		minute=input.nextInt();
		int clockAngle=calcAngle(hour,minute);
		if(clockAngle==0)
		{
			System.out.println("hour and minute hands overlaps");
		}
		else
		{
			System.out.println(clockAngle+"degree");
		}
		input.close();
		System.exit(0);

		
	}

}
