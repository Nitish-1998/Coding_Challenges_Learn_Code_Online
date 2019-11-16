public class Earnings 
{
	public static void main(String[] args) 
	{
		float spentOnDvd=42.0f;
		float percentOfTotalEarning=12.0f;
		float totalEarning=(spentOnDvd*100.0f)/percentOfTotalEarning;
        System.out.println(totalEarning);
		float totalsaving=totalEarning-spentOnDvd;
        System.out.println("Deposit in Saving Account: "+"$"+totalsaving);
	}

}
