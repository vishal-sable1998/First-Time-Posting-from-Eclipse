package Arrays;

public class missing_Number {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,4,5};
		int sum=0;
		int sum1=0;
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		for(int j=0; j<b.length; j++)
		{
			sum1=sum1+b[j];
		}
		System.out.println("MIssing element is :"+ (sum-sum1));

	}

}
