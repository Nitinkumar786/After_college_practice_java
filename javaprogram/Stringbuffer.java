package javaprogram;

public class Stringbuffer
{
public static void main(String[] args)
{
	StringBuffer name = new StringBuffer("Nitin");
	System.out.println(name);
	System.out.println(name.length());
	System.out.println(name.reverse());
	System.out.println(name.delete(0, 1));
	System.out.println(name.append('n'));
	System.out.println(name.charAt(3));
	}
}
