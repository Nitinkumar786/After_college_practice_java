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
public class elseifstmtladder {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num :-");  
        int a =sc.nextInt();
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("equal");
        }
        else if(a>b)
        {
            System.out.println("A is greater then B");
        }
        else
        {
            System.out.println("A is lesser :-");
        }
    }
}
 