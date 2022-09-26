package javaprogram;
import java.util.Scanner;
public class circlearea {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	float pi,r,a;
	pi=3.14f;
	System.out.println("Enter the Redius:-");
	r=sc.nextFloat();
	a=pi*r*r;
	System.out.println("Result = "+a);
	
	}
}
