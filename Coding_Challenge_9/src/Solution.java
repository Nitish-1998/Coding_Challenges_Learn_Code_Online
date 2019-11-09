public class Solution 
{
	public static void main(String[] args) 
	{
		int sweaterPrice=68;
		int sweaterCount=3;
		int computerGamePrice=75;
		int computerGameCount=1;
		int bracletPrice=43;
		int bracletCount=2;
		
		//Discount And Rebate
		int returnedBracletCount=1;
		int rebateOnComputerGame=10;
		
		//Calculation Part
		int totalGiftPrice=(sweaterPrice*sweaterCount)+(computerGamePrice*computerGameCount)+(bracletPrice*bracletCount);
		int discountAndRebate=(bracletPrice*returnedBracletCount)+rebateOnComputerGame;
		int finalGiftPrice=totalGiftPrice - discountAndRebate;
		System.out.println("Final Gift Price Is $"+finalGiftPrice);

	}

}
