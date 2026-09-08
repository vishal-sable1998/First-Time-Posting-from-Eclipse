package Interface;

public interface program_01 {
	
	int a=100;   // public static final
	static int b=200;
	
	public static void test()
	{
		System.out.println("From interface static method");
	}
	public default void test1()
	{
		System.out.println("From interface default method");
	}
	public abstract void test2();
	
	static String test3()
	{
		return "Java from interface";
	}
	public default String test4()
	{
		return "From deafult return method";
	}
	public abstract void test5();
}
