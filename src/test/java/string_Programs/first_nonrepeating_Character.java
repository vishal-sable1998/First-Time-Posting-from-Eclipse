package string_Programs;

import java.lang.String;

public class first_nonrepeating_Character {

	public static void main(String[] args) {
		String s="meeram";
		
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
			if(s.indexOf(s.charAt(i)) != i)
			continue;
			for(int j=0; j<s.length(); j++)
			{
				if(s.charAt(i)== s.charAt(j))
				{
					count++;
				}
			}
			
			if(count ==1)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}

	}

}
