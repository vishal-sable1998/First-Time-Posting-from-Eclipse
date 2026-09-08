package string_Programs;

public class duplicate_charcters {

	public static void main(String[] args) {
		String s="MeeraSeetaGeettaReetaAreFriends";
		String s1=s.toLowerCase();
		
		for(int i=0; i<s1.length(); i++)
		{
			int count=0; 
			if(s1.indexOf(s1.charAt(i)) != i)
			continue;
			for(int j=0; j<s1.length(); j++)
			{
				if(s1.charAt(i)== s1.charAt(j))
				{
					count++;
				}
			}
			if(count >1)
			{
				System.out.println(s1.charAt(i)+" --> "+ count);
			}
		}

	}

}
