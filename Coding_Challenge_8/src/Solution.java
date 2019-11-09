public class Solution 
{
	static  float avgWork(int a, int b , int c , int d , int e, int f, int nCount)
	{
		float totalHrs=(float)a+b+c+d+e+f;
		float avgHrs=(float)totalHrs/nCount;
		return avgHrs;
	}
	public static void main(String[] args) 
	{
		int howard=8,pease=10,campbell=9,grace=8,mccharthy=7,murphy=12;
		int nurseCount=6;
		float avgHours=avgWork(howard,pease,campbell,grace,mccharthy,murphy,nurseCount);
		System.out.printf("The Average NUmber of Hours Is :- %f ",avgHours);
	}

}
