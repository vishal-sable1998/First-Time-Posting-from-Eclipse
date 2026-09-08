package Arrays;

public class second_minimum_number {

	public static void main(String[] args) {
		 int a[] = {1,2,3,7,8,9,5};
		 int temp=0;
		 for(int i=0; i<a.length; i++)
		 {
			 for(int j=i+1; j<a.length; j++)
			 {
				 if(a[i] < a[j])
				 {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 for(int y:a) {System.out.println(y);};
		 System.out.println("Second Smallest Element is :" +a[a.length-2]);

	}

}
