package method_example;
import method_example2.example4;

public class method1 {

	public static void main(String[] args) {//for command argument
		iAmStatic();
		iAmStatic("Melody");
		
		example2.iAmStaticExample2();
		example2.iAmStaticExample2("Boris");
		
		example3.iAmStaticExample3();
		example3.iAmStaticExample3("Liu");
		//different package
		example4.iAmStaticExample4();
		example4.iAmStaticExample4("Sabotinova");
		
		//classname objectname = new(dynamic memory allocation) constructor()
		method1 m = new method1();//instantiation or object creation
		m.iAmNonStatic();
	}
	public static void iAmStatic() {
		System.out.println("hello from example 1");
	}
	public static void iAmStatic(String name) {
		System.out.println("hello static by name from example 1 and name = "+name);
	}
	public static void iAmNonStatic() {
		System.out.println("Non static method of method1 class");
	}

	
}
