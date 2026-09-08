package super_KeyWord;

public class program_01 {
	int f=10;
	double g=10.7844;
	public void test()
	{
		System.out.println("From parent class");
	}
	public void ramesh()
	{
		System.out.println("from parent class ramesh");
	}
	
	program_01()
	{
		System.out.println("Non parameterized constructor from parent");
	}
	public program_01(int x)
	{
		System.out.println("Parameterized constrcutor from parent");
	}
}
