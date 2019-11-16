public class Solution 
{
	public static void main(String[] args) 
	{
		int firstMovieTimeMinute=100;
		int secondMovieTimeMinute=110;
		int minutePerHour=60;
		
		//Convert minute to hrs
		float spentTime=(float)(firstMovieTimeMinute+secondMovieTimeMinute)/minutePerHour;
       System.out.println("Total Hour :- "+spentTime+"Hrs");		

	}

}
