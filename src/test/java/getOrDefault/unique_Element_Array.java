package getOrDefault;
import java.util.Map;
import java.util.HashMap;

public class unique_Element_Array {

	public static void main(String[] args) {
		int[] a= {10,20,30,500,10,20,30,40};
		Map<Integer,Integer> mp= new HashMap<>();
		for(int x:a)
		{
			mp.put(x,mp.getOrDefault(x,0)+1);
		}
		for(Map.Entry<Integer,Integer> entry:mp.entrySet())
		{
			if(entry.getValue() ==1)
			{
				System.out.println(entry.getKey());
			}
		}
	}

}
