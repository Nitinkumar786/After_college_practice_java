/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Nitin
 */
public class Ifelse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age :");
        int a=sc.nextInt();
        System.out.println("Enter the age compear :");
        int b=sc.nextInt();
        if(a>b)
        {
            System.out.println("adult");
        }
        else
        {
            System.out.println("not adult");
        }
    }
}
