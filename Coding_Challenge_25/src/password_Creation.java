 import java.util.*;
public class password_Creation 
{
	public static final int pl=8;
	
	public static boolean is_Letter(char ch)
	{
		ch=Character.toUpperCase(ch);
		return(ch>='A'&&ch<='Z');
	}
	
	public static boolean is_Numeric(char ch)
	{
		return(ch>='0'&&ch<='9');
	}
	
	public static boolean is_valid_password(String password)
	{
		if(password.length() < pl)
		{
			return false;
		}
		int charCount=0,numCount=0;
		
		for(int i=0;i<password.length();i++)
		{
			char ch=password.charAt(i);
			if(is_Numeric(ch))
			{
				numCount++;
			}
			else if(is_Letter(ch))
			{
				charCount++;
			}
			else 
			{
				return false;
			}
			
		}
		return(charCount>=2&&numCount>=2);
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		String s;
		System.out.print("1. A Password must have at least eight charcter.\n" +"2. A Pasword consists of only letters and digits. \n"+
		"3.  A Pasword must contain at least two digits. \n");
		System.out.print("Enter the Password:- ");
		s=input.nextLine();
		
		if(is_valid_password(s))
		{
			System.out.println("Password is Valid According to All Needs Required :- "+s);
		}
		else
		{
			System.out.println("Password is not Valid:- "+s);
		}
		input.close();

	}

}
