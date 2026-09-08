package Arrays;

public class binary_Search {

	public static void main(String[] args) {
		int a[]= {40,7,91,87,4,4,15,7,15,78,15};
		int search_Element= 78;
		
		for(int i=0; i<a.length; i++)
		{
			if(search_Element == a[i])
			{
				System.out.println("ELement is found. And element is :" + i );
			}
		}

	}

}
