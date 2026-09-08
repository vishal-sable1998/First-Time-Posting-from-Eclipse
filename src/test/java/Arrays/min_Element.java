package Arrays;

public class min_Element {

	public static void main(String[] args) {
		 int a[] = {7,8,9,2,1,6,4,32,9,10};
		 int min=a[0];
		 for(int j=1; j<a.length; j++)
		 {
			 if(a[j] < min)
			 {
				 min=a[j];
			 }
		 }
		 System.out.println(min);

	}

}
