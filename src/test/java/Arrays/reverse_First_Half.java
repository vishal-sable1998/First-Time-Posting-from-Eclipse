package Arrays;

public class reverse_First_Half {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		int temp=0;
		int min=a.length/2;
		int n=a.length;
		for(int i=min-1, j=0; i>j; i--,j++)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		for(int y:a)
		{
			System.out.println(y);
		}

	}

}
