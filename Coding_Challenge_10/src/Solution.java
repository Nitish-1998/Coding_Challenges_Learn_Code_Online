public class Solution 
{
	public static void main(String[] args) 
	{
		int totalMilesToDrive=2052;
		int totalDays=6;
		int townToStopPerDay=2;
		double kmPerMile=1.60934;
		int avgMiles=(totalMilesToDrive/totalDays)/townToStopPerDay;
		
		//Convert miles to Km
		double avgKM=avgMiles*kmPerMile;
		
		
		System.out.println("She Drive Average of "+avgKM+"Km Between Every Stop.");

	}

}
