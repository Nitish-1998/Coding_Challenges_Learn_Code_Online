public class Square 
{
	public static int findSquare(int n)
	{
		int odd=1,sq=0;
		
	//	n=Math.abs(n);
		while(n-- >0)
		{
			sq=sq+odd;
			odd=odd+2;
			System.out.println("N:- "+ n +"    "+"SQ:-"+sq+"  "+"Odd:-"+odd);
		}
		return sq;
	}
	public static void main(String[] args) 
	{
		System.out.println("The Square OF the Passed Number:- "+findSquare(8));
	}

}
