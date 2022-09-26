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
public class minutes {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the houres");
                int min=sc.nextInt();
                int hr=min/60;
                int sec=min%60;
                System.out.println("there hr is "+hr+" and  "+sec+" minute in "+min+" minute !");
        
    }
}
