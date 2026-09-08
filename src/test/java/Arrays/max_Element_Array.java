package Arrays;

public class max_Element_Array {

	public static void main(String[] args) {
		 int a[] = {7,8,9,2,1,6,4,32,9,0,10};
		 int max=a[0];
		 for(int i=1; i<a.length; i++)
		 {
			 if(a[i] > max)
			 {
				 max=a[i];
			 }
		 }
		 System.out.println(max);

	}

}
