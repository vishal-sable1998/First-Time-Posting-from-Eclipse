package getOrDefault;
import java.util.Map;
import java.util.HashMap;

public class count_frequency_In_Array_Using_Collection {

	public static void main(String[] args) {
		int[] a= {10,20,30,10,20,30,40};
		
		Map<Integer,Integer> ts= new HashMap<>();
		
		for(int x:a)
		{
			ts.put(x,ts.getOrDefault(x,0)+1);
		}
		for(Map.Entry<Integer,Integer> entry:ts.entrySet())
		{
			System.out.println(entry.getKey()+"   "+ entry.getValue());
		}

	}

}
