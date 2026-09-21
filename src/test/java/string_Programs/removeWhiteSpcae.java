package string_Programs;

public class removeWhiteSpcae {

	public static void main(String[] args) {
		String s="hyufhu  hfh dfshi v 889 ";
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if(c !=' ')
			{
				sb.append(c);
			}
		}
		System.out.println(sb.toString());

	}

}
