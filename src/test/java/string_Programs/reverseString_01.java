package string_Programs;

import java.lang.String;
import java.lang.StringBuilder;
import java.awt.Robot;


public class reverseString_01 {

	public static void main(String[] args) {
		//Way 1
    	String s="Hi Vishal How are You!";
		String rev="";
//		for(int i=s.length()-1; i >= 0 ; i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
		// ** Way= 2
//		StringBuilder sb= new StringBuilder(s);
//		System.out.println(sb.reverse().toString());
    	
    	// ** way=3
    	char a[]=s.toCharArray();
    	System.out.println(a.length);
    	for(int i=a.length-1; i>=0; i--)
    	{
    		rev=rev+a[i];
    	}
    	System.out.println(rev);
    	
	}

}
