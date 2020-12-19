package example1;

public class Demo1 {

	public static void main(String[] args) {
		/*8 primitive data types
		 * datatype    size(bytes)    default value
		 * -----------------------------------
		 * byte			1				0
		 * short		2				0
		 * int			4 				0
		 * long     	8				0
		 * float		4 				0.0000f any float variable end it with f
		 * double		8				0.0000d takes all the decimal values as double by default
		 *char			2				'\u00000' java support UNI-CORE char set
		 * boolean		1				false
		 * 
		 */
		int i1 = 10;
		System.out.println("i1=" +i1);
		
		float f = 123.55f;
		System.out.println(" f = "+f);
		
		long l=12345678234567L;
		System.out.println("l = "+l);
		
		String s1="Melody";
		System.out.println("s1: "+s1);
		
		double d = 13.4455;
		System.out.println("d = "+d);	
		
		char c = 'h';
		System.out.println("C = "+c);
		//arithmetic and relational operators
		System.out.println("arithmetic and relational operations ");
		int i2 = 12;
		System.out.println("i1+i2="+(i1+i2));
		System.out.println("i1-i2="+(i1-i2));
		System.out.println("i1*i2="+(i1*i2));
		System.out.println("i1/i2="+(i1/i2));
		System.out.println("i1%i2="+(i1%i2));
		boolean b=i1>i2;
		System.out.println("i1>i2 "+b);
	}

}
