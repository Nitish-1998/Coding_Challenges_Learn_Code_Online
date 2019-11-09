public class Solution 
{
	 static int multiply(int x,int y)
	{ 
		 /*0 multiplied with anything gives 0*/
		 if(y==0)
			 return 0;
		 /*Add x one by one */
		 if(y>0)
			 return(x+multiply(x,y-1));
		 /*The case where Y is negative*/
		 if(y<0)
			 return -multiply(x,-y);
		 
		 
		return -1;
	}
	public static void main(String[] args) 
	{
		int peopleTravelDaily=1200000;
		int daysOfYear=365;
		int peopleTravelYearly=multiply(peopleTravelDaily,daysOfYear);
        System.out.println(peopleTravelYearly);
        
	}

}
