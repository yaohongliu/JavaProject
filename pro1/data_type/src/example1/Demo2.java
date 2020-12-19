package example1;

public class Demo2 {

	public static void main(String[] args) {
		/*
		 * casting/type conversion of one data type to another
		 * 
		 */
		int x = 12;
		float f = x;//implicit casting
		System.out.println("x = "+x);
		System.out.println("f = "+f);
		f = 89.123f;
		System.out.println("f = "+f);
		double d = f;
		System.out.println("d = "+d);
		
		char ch = 'Y'; // 89
		int q = ch;
		System.out.println("q = "+q);
		q++;
		ch=(char)q;//excplicit casting
		System.out.println("ch = "+ch);
		
		x = (int)f;
		System.out.println("x = "+x);
	}

}
