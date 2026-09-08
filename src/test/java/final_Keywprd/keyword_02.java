package final_Keywprd;

public class keyword_02 extends program_01 { // we can not extends final class
	
	public void test()  // we can not over ride the final method
	{
		System.out.println("From child");
	}

	public static void main(String[] args) {
		program_01 p= new program_01();
	//	p.x=200; //a variable is final we can not re assign the value
		
	    System.out.println(p.x);
	    p.test();

	}

}
