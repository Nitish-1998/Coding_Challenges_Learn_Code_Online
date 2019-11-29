import java.util.*;
public class Int_To_Roman 
{
	private static int [] bases= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private static HashMap<Integer,String>map=new HashMap<Integer,String>();
    public static void setup()
    {
    	map.put(1, "I");
    	map.put(4, "IV");
    	map.put(5, "V");
    	map.put(9, "IX");
    	map.put(10, "X");
    	map.put(40, "XL");
    	map.put(50, "L");
    	map.put(90, "XC");
    	map.put(100, "C");
    	map.put(400, "CD");
    	map.put(500, "D");
    	map.put(900, "CM");
    	map.put(1000, "M");
    }
    public static String intToRoman(int num)
    {
    	setup();
    	String result=new String();
    	for(int i:bases)
    	{
    		while(num>=i)
    		{
    			System.out.println(result);
    			result=result+map.get(i);
    			System.out.println(result);
    			num=num-i;
    			System.out.println(num);
    		}
    	}
    	return result;
    }
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Julis Book Count:- ");
		int jbook=input.nextInt();
		System.out.println("Enter Nancy Books Count:- ");
		int nbook=input.nextInt();
		int value=jbook+nbook;
		
		String m=intToRoman(value);
		System.out.println(value+" Int to Raman is--------->"+m);
		input.close();
	}

}
