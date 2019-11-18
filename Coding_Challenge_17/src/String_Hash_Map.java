import java.util.*;
public class String_Hash_Map 
{
	public static void printStringDuplicate(String value)
	{
		String item[]=value.split("");
		Map<String,Integer>map=new HashMap<>();
		for(String t:item)
		{
			if(map.containsKey(t))
			{
				map.put(t, map.get(t)+1);				
			}
			else
			{
				map.put(t, 1);
			}			
		}
		Set<String>keys=map.keySet();
		for(String key:keys)
		{
			if(map.get(key)>1)
			{
				System.out.print(key+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		String students="Aman Ankit Deepak Aman Deepak Amit Ankit Vansh Aman Sagar";
        printStringDuplicate(students);
	}

}
