public class Driving 
{
	public static void main(String[] args) 
	{
		int totalDistance=2052;
		int totalDays=6;
		int perDayDistance=totalDistance/totalDays;
		double kmInMile=1.60934;
		double distanceBetweenTwoStops=perDayDistance/2;		
		System.out.println("Average Kilometer Distance Between Two Stops:- "+distanceBetweenTwoStops*kmInMile+"Km");

	}

}
