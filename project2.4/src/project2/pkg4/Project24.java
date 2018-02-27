/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.pkg4;

import java.util.Scanner;

/**
 *
 * @author triosStudent
 */
public class Project24 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        final double POUND1=0.454;
        Scanner input= new Scanner (System.in);
        double pounds;
        double kilograms;
        System.out.print("enter a number in pounds: ");
        pounds=input.nextDouble();
        kilograms= pounds*POUND1;
        System.out.println(pounds  + " pounds is " + kilograms);
        
    }
    
}
