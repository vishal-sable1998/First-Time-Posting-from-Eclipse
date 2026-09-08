package Interface;

public class program_03 {

	public static void main(String[] args) {
		program_01 p = new progarm_02();
		p.test1();
		p.test2();
		// System.out.println(p.test3());;
		p.test5();
		program_01.test();   // static method in interface called using interfaceName.methodName
		System.out.println(program_01.test3());
		System.out.println(p.test4());
		System.out.println(p.a);
		// p.a=400;  // in interface variable in public static final
		System.out.println(p.b);
		

	}

}
