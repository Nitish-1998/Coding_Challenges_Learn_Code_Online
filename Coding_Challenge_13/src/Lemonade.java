import java.util.*;
public class Lemonade 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int karaLemonadePrice=5,k;
		int raniLemonadePrice=7,r;
		System.out.println("Enter the KARA Glasses:- ");
		k=input.nextInt();
		System.out.println("Enter the RANI Glasses:- " );
		r=input.nextInt();
		int km=karaLemonadePrice*k;
		int rm=raniLemonadePrice*r;
		
		if(km>rm)
		{
			System.out.println("Rani MOney:- "+rm);
			System.out.println("Kara Made More Money:-  "+km);
			km=km-rm;
			System.out.println("Kara Beats The Amount Of Rani By:-  "+km);
			System.exit(0);
		}
		else if (rm>km)
		{
			System.out.println("Kara MOney:- "+km);
			System.out.println("Rani Made More Money:-  "+rm);
			rm=rm-km;
			System.out.println("Rani Beats The Amount Of Kara By:-  "+rm);
			System.exit(0);
		}
		else if(km==rm)
		{
			System.out.println("Kara Money is Equal to Rani");
		}
		input.close();  
		
	}

}
