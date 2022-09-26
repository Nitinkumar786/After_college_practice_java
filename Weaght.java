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
public class Weaght {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = sc.nextLine();
        System.out.println("Enter the weaght : ");
        int weaght = sc.nextInt();
        if (weaght >20) {
            if (weaght <50) {
                System.out.println("20  kg :");
            } else {
                System.out.println("50 kg :");
            }
        }
        else
        {
            System.out.println("above weaght :");
        }
    }
}
