package string_Programs;

public class reverse_Complete_Sentence {

	public static void main(String[] args) {
		String s="I am Om and Good Student also";
		String a[]= s.split(" ");
		StringBuilder sb= new StringBuilder();
		for(int i=a.length-1; i >= 0; i--)
		{
			 sb.append(a[i]).append(" ");
		}
		System.out.println(sb.toString().trim());

	}

}
