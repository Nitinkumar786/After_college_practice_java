/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;
import java.util.Scanner;
/**
 *
 * @author Nitin
 */
public class Switchstmnt {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int cal=sc.nextInt();
        int a=sc.nextInt();
                int b=sc.nextInt();
        switch(cal)
        {
            case 1 -> System.out.println(a+b);
            case 2 -> System.out.println(a-b);
            case 3 -> System.out.println(a*b);
            default -> System.out.println("invalid number");
        }
    }
}
