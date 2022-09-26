/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprograms;

/**
 *
 * @author Nitin
 */
public class Leapyear {
    public static void main(String[] args)
    {
        int year=2020;
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("Leap year ");
                }
                else
                {
                    System.out.println("not a Leap year ! : ");
                }
            }
            else
            {
                System.out.println("Leap year : ");
            }
        }
        System.out.println(" not a Leap year : ");
    }
}

