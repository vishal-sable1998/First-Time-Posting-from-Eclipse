package string_Programs;

public class count_occurenceOfCharacters {

	public static void main(String[] args) {
		String s="hello";
		
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
			System.out.println(s.charAt(i)+" "+count);
		}
	}

}
