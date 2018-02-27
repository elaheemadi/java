/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3.pkg8;
import java.util.Scanner;
/**
 *
 * @author triosStudent
 */
public class Project38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int num1,num2,num3;
        System.out.println("Enter three number : ");
        num1 = input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();
        if ((num1 < num2) && (num2 < num3)){
    System.out.println("The sorted numbers are " + num1 + " " + num2 + " " + num3);
    }
if ((num1 < num2) && (num2 > num3)){
    System.out.println("The sorted numbers are " + num1 + " " + num3 + " " + num2);
    }
if ((num1 > num2) && (num2 > num3)){
    System.out.println("The sorted numbers are " + num3 + " " + num2 + " " + num1);
    }
if ((num1 > num2) && (num2 < num3)){
    System.out.println("The sorted numbers are " + num2 + " " + num1 + " " + num3);
    }
}

      
                
       
        
     
    
}
