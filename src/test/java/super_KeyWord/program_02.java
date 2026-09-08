package super_KeyWord;

public class program_02 extends program_01{

	int f=100;
	double g=789.554;
	public void test()
	{
		System.out.println("From Child class");
		System.out.println(super.f); //calling parent class varibale 
		System.out.println(super.g); //calling parent class varibale 
	}
	public void ramesh()
	{
		super.ramesh();  //calling parent class method from child cls using super keyword
		System.out.println("From Child Class Ramesh");
	}
	program_02()
	{
		super(10);
		System.out.println("Child class non-parameterized constrcutor");
	}
	program_02(int y)
	{
		super();
		System.out.println("Child class parameterized constructor");
	}
	public static void main(String[] args) {
		
		program_02 p1=new program_02();
		System.out.println(p1.f);  //called child class variable
		System.out.println(p1.g);  //called child class variable
		p1.test();
		p1.ramesh();
	}

}
