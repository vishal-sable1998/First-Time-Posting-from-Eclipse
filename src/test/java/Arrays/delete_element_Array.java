package Arrays;

public class delete_element_Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int del_element=4;
		
		for(int i=0; i<a.length; i++)
		{
			if(del_element ==a[i])
			{
				for(int j=i; j<a.length-1; j++)
				{
					a[j]=a[j+1];
				}
				break;
			}
		}
		for(int k=0; k<a.length-1; k++)
		{
			System.out.println(a[k]);
		}
	}

}
