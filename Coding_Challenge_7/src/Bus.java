public class Bus 
{
	public static int peoples=1200000,peryearpeople=0;
	 public int Person(int d)
	{
		if(d<=365)
		{
			peryearpeople=peryearpeople+peoples;
			Person(d+1);			
		}
		return peryearpeople;		
	}

	public static void main(String[] args) 
	{
		Bus b=new Bus();
		System.out.println("Total Person Travell In Bus Per Year Is:- ");
		System.out.println(b.Person(1));
		
		

	}

}
