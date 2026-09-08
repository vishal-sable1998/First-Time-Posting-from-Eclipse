package getOrDefault;

import java.util.HashMap;
import java.util.Map;

public class frequency_Charcter_String {

	public static void main(String[] args) {
		String ts="OmkareOmkar test";
		Map<Character,Integer> mp= new HashMap<>();
		for(char ch:ts.toCharArray())
		{
			mp.put(ch,mp.getOrDefault(ch,0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry:mp.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}

	}

}
