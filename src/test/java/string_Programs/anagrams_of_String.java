package string_Programs;

import java.util.Arrays;

public class anagrams_of_String {

	public static void main(String[] args) {
		String s1="Silent";
		String s2="Listen";
		String s3=s1.toLowerCase();
		String s4=s2.toLowerCase();
		char s5[]=s3.toCharArray();
		char s6[]=s4.toCharArray();
		Arrays.sort(s5);
		Arrays.sort(s6);
		if(Arrays.equals(s5, s6))
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("not anagrams");
		}
		
	}

}
