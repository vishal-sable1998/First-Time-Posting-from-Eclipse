package Arrays;

public class descending {

	public static void main(String[] args) {
		  int a[] = {7,8,9,2,1,6,4,32,9,0,10};
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
	        for(int x:a)
	        {
	        	System.out.println(x);
	        }

	}

}
