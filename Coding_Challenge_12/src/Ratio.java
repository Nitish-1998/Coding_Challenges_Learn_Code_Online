public class Ratio 
{
	public static void main(String[] args) 
	{
		int redBlood=5000000;
		int whiteBlood=8000;
		int result=whiteBlood%redBlood;
		int whiteRatio=whiteBlood/result;
		int redRatio=redBlood/result;
		System.out.print("Ratio of WhiteBlood to RedBlood Corpuscles:- "+ whiteRatio +"."+ redRatio);

	}

}
