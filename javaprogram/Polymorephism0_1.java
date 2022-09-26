package javaprogram;

public class Polymorephism0_1 {
//Overloding methods
//	poits
//	1) same name
//	2) same class
//	3) deff args
//	4) -no args
//	   -seq args
//	   -type of args
	void overloading()
	{
		System.out.println("overloading method");
	}
	void overloading(int a)
	{
		System.out.println("deff args");
	}
	public static void main(String[] args)
	{
		Polymorephism0_1 print = new Polymorephism0_1();
		System.out.println("Overloading_demo");
		print.overloading();
		print.overloading(1);
	}
}
