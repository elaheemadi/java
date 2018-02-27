/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.pkg2;

import java.util.Scanner;

/**
 *
 * @author triosStudent
 */
public class Project22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double PI=3.14159;
        Scanner input= new Scanner (System.in);
        double radius;
        double lenght;
        double area;
        double volume;
        System.out.print("enter a number for radiuse: ");
        radius=input.nextDouble();
        System.out.print("enter a number for lenght: ");
        lenght=input.nextDouble();
        area= radius *radius*PI;
        System.out.println("The area of the cylinder of the radius " + radius + " is " + area);
        volume = area *lenght;
        System.out.println("The volumn of the cylinder of the radius " + radius + 
                "and the lenght "+lenght+ " is " + volume);
        
    }
}
