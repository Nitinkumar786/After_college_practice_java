package javaprogram;

//same name
//diff class
//same args
//inheritance(is arelastionship)
// -no args
// -type of args
// -seq of args
public class Overriding_demo {
void test(String c)
{
	System.out.println("overiding method");
	}
}
class Test extends Overriding_demo
{
	void test(String a)
	{
		System.out.println("324");
	}
	public static void main(String[] args)
	{
		Test v = new Test();
		v.test("abc");
		
	}
	
}
