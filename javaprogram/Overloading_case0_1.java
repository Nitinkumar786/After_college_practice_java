package javaprogram;

public class Overloading_case0_1 {
void test()
{
	System.out.println("no args");
	}
void test(int a)
{
	System.out.println("int method");
	}
void test(String s)
{
	System.out.println("String method");
	}
void test(double w ,float e)
{
	System.out.println("Double or float methods ");
	}
void test(char x,boolean z)
{
	System.out.println("char and boolean methods  ");
	}
public static void main(String[] args)
{
	Overloading_case0_1 print = new Overloading_case0_1();
	System.out.println("     overloading__methods");
	print.test();
	print.test(12);
	print.test("abc");
	print.test(1.1f,0.13f);
	print.test('a',false);
	}
}
 