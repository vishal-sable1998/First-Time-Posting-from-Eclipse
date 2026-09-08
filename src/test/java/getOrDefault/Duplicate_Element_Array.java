package getOrDefault;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicate_Element_Array {

	public static void main(String[] args) {
        int[] a= {10,20,30,10,20,30,40};
		Map<Integer,Integer> ts= new HashMap<>();
		for(int z:a)
		{
			ts.put(z,ts.getOrDefault(z,0)+1);
		}
		for(Map.Entry<Integer,Integer> entry:ts.entrySet())
		{
			if(entry.getValue() >1)
			{
				System.out.println(entry.getKey());
			}
		}	
	}
}
