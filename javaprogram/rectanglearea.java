package javaprogram;
import java.util.Scanner;
public class rectanglearea {
public static void main(String[] args)
{
	int b,h,area;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the base value :-");
	b=sc.nextInt();
	System.out.println("Enter the hight value :-");
	h=sc.nextInt();
	area=b*h;
	System.out.println(area);
	
	}
}
