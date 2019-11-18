import java.util.*;
public class Fish_Length 
{
	static int fish(int a[])
	{
		Arrays.sort(a);
		int len=a.length;
		int fsize=a[len-1];
		return  fsize;
		
	}
	public static void main(String[] args) 
	{
		int arr[]= {12,13,8,10,17};
		int largestFish=fish(arr);
		System.out.println("Largest Fish Is:- "+largestFish);

	}

}
