package override_Method;

public class program_02 extends program_01 {

	public void test1(int a)
	{
		System.out.println("Test1 method from Child class :" +a);	
	}
	public void test2(int a, String s)
	{
		System.out.println("Test2 method from Child class :" + a +" "+s);	
	}
	public void test3(long a, float d)
	{
		System.out.println("Test3 method from Child class :"+ a+ " "+d);	
	}
}
