/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7.pkg2.pkg2reverse;
import java.util.Scanner;
/**
 *
 * @author triosStudent
 */
public class Project722reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int myArray[]=new int[10];
        System.out.println("Plese enter 10 value for Array :");
        for (int i=0;i<myArray.length;i++)
        {
            myArray[i]= input.nextInt();
            System.out.println("myArray[" +i+"]=["+myArray[i]+"]");
        }
        System.out.println("The reverse of myArray is :");
        for(int i=myArray.length-1;i>=0;i--)
        {
            
            System.out.println("["+myArray[i]+"]");
        }
    }
    
}
