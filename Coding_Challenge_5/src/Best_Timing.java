public class Best_Timing 
{

	public static void main(String[] args) 
	{
		int arr[]= {66,57,54,53,64,52,59};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("The Best Timimg is:-"+arr[0]);

	}

}
