import java.util.*;
public class Combination 
{
	public static void printAllCombination(String []sArray, int start)
	{
		for(int i=start;i<sArray.length;i++)
		{
			String temp=sArray[start];
			sArray[start]=sArray[i];
			sArray[i]=temp;
			printAllCombination(sArray,start+1);
			sArray[i]=sArray[start];
			sArray[start]=temp;
		}
		if(start==sArray.length-1)
		{
			System.out.println(Arrays.toString(sArray));
		}
	}
	public static void main(String[] args) 
	{
		String studentArray[]= {"Ram","Anuj","Deepak","Ravi"};
		printAllCombination(studentArray,0);
	}

}
