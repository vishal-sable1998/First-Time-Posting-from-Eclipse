package Arrays;

public class reverse_Full_Array {

	public static void main(String[] args) {
		 int a[] = {7,8,9,2,1,6,4};
		 int temp=0;
		 for(int i=0, j=a.length-1; i<j; i++, j--)
		 {
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		 }
		 for(int x:a)
		 {
			 System.out.println(x);
		 }

	}

}
