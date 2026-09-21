package string_Programs;

public class removeJunkCharacter {

	public static void main(String[] args) {
		String s="87487*(**(#testta";
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				sb.append(c);
			}
		}
		System.out.println(sb.toString());

	}

}
