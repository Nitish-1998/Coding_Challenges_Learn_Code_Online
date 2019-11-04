public class Hot_Dog 
{
	public static void main(String[] args) 
	{
	   int HotDog_Qty=400,packet=8;
	   System.out.println("Your Total Hot Dogs:- "+HotDog_Qty+".");
	   for(int i=1;i<=HotDog_Qty;i++)
	   {
		   int result=packet*i;
		   if(result==HotDog_Qty)
		   {
			   System.out.println("Total Packet Will be:-  "+i +" Of 8 Hot Dogs In One Packet.");
			   break;
		   }
	   }

	}

}
