/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7.pkg2revese;
import java.util.Scanner;
/**
 *
 * @author triosStudent
 */
public class Project72revese {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int myArray[]=new int[10];
        System.out.println("Please enter 10 value for Array :");
        for(int i=0;i<myArray.length;i++)
        {
            myArray[i]=input.nextInt();
             System.out.println("The constants of myArray[ "
             + i+" ]is " + myArray[i]);
        }
        
        int[] reversed = new int[myArray.length];
        System.out.println("The reversed array of myArray is :");
    for (int i=0; i<myArray.length; i++) {
        reversed[i] = myArray[myArray.length - 1 - i];
         System.out.println(" reversed[" + i+ "]="+reversed[i]);
    }
    
}
    }
    

