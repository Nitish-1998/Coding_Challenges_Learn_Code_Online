public class Square_Without_Using_Multiply 
{
	public static int sqrt(int num)
	{
		int i=0,res=0; 
		while(i<num)
		{
			res=res+num;
			i++;
		}
	    return res;
	}
	public static void main(String[] args) 
	{
		System.out.println(sqrt(4));
	

	}

}
