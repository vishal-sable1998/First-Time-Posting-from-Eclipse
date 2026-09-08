package getOrDefault;

import java.util.HashMap;
import java.util.Map;

public class First_Non_Repeated_Character_String {

	public static void main(String[] args) {
		String ts="vishalvishalt";
		ts=ts.toLowerCase();
		Map<Character,Integer> mp= new HashMap<>();
		for(char c:ts.toCharArray())
		{
			mp.put(c,mp.getOrDefault(c,0)+1);
		}
		for(char f:ts.toCharArray())
		{
			if(mp.get(f)==1)
			{
				System.out.println(f);
				break;
			}
		}
	}
}
