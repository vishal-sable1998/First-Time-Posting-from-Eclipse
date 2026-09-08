package getOrDefault;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class program_01 {

	public static void main(String[] args) {
		Map<Integer, String> mp= new HashMap<Integer,String>();
		mp.put(1,"Vishal");
		mp.put(2,"Om");
		mp.put(3,"Meera");
		mp.put(4,"Shantaram");
		
		for(Map.Entry<Integer,String> entry:mp.entrySet())
		{
			System.out.println(entry.getKey()+"   "+ entry.getValue());
		}

	}

}
