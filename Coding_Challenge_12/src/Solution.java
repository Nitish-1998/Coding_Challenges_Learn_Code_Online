public class Solution 
{
	
	public static void main(String[] args) 
	{
		int redCorpuscles=5000000;
		int whiteCorpuscles=8000;
		int  factor=greatestCommonFactor(whiteCorpuscles,redCorpuscles);
        System.out.println(factor);
		int whiteRatio=whiteCorpuscles/factor;
		int redRatio=redCorpuscles/factor;
		System.out.println(whiteRatio);
		System.out.println(redRatio);
		System.out.println("Aspect Ratio: "+ whiteRatio +"."+ redRatio);

	}
	public static int greatestCommonFactor(int whiteC,int redC)
	{
		return(redC==0)? whiteC:greatestCommonFactor(redC,whiteC%redC);
	}
	
}
