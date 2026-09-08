package Arrays;

public class basic_01 {

	public static void main(String[] args) {
		int a[]= {10,20,80,8,80,80,0};
		for(int i=0; i<a.length; i++) // using for loop
		{
			System.out.println(a[i]);
		}
		
		
		  for(int x:a) // using for each loop
		  { 
			  System.out.println(x);
		  }
		 
	}

}
