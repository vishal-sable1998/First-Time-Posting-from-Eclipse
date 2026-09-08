package string_Programs;

import java.lang.String;
import java.lang.StringBuilder;

public class reverse_of_Each_word {

	public static void main(String[] args) {
		String s="I am Om and Good Student also";
		String a[]=s.split(" ");
		StringBuilder sb1= new StringBuilder();
		for( int i=a.length-1; i >= 0; i--)
		{
			StringBuilder sb= new StringBuilder(a[i]);
			sb1.append(sb.reverse().toString()).append(" ");
		}
		System.out.println(sb1.toString().trim());
	}

}
