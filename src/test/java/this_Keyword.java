
public class this_Keyword {

	int x=100;
	
	public final void test()
	{
		System.out.println(this);
		System.out.println("Non-static method from this class");
	}
	public static void main(String[] args) {
		
		this_Keyword tk=new this_Keyword(); // this keyword we can not use in static methods. this belong to class varibale not object variable.
		System.out.println(tk.x);
		tk.test();
		this_Keyword tk_01=new this_Keyword();
		tk_01.test();
		

	}

}
