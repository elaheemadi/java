/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2.pkg5;
import java.util.Scanner;
/**
 *
 * @author triosStudent
 */
public class Project25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tips,subtotal,grantuityRate,total;
        Scanner input =new Scanner(System.in);
        System.out.print("enter the subtotal and the grantuity rate :");
        subtotal=input.nextDouble();
        grantuityRate = input.nextDouble();
        tips=(subtotal*grantuityRate)/100;
        total=tips+subtotal;
        System.out.println("The tips is $"+  tips + " and the total is $" + total);
        
        
        // TODO code application logic here
    }
    
}
