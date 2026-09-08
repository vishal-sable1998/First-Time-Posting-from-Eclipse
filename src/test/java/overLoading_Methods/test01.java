package overLoading_Methods;

public class test01 {
	public static void main(String[] args) {
		test01 t= new test01();
		t.ride(124,7887.55f);
		t.ride(89787.554f, 8988);

	}
	public void ride(int b, Float a)
	{
		System.out.println(a);
	}
	
	public void ride(Float b, int a)
	{
		System.out.println("Overloaded method");
	}

}
