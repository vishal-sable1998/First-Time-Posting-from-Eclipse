package getOrDefault;

import java.util.HashMap;
import java.util.Map;

public class duplicateCharacter_String {

	public static void main(String[] args) {
		String ts="OmkareOmkar test";
		Map<Character,Integer> mp= new HashMap<>();
		for(char c: ts.toCharArray())
		{
			mp.put(c,mp.getOrDefault(c,0)+1);
		}
		for(Map.Entry<Character,Integer> entry: mp.entrySet())
		{
			if(entry.getValue() >1)
			{
				System.out.println(entry.getKey());
			}
		}

	}

}
