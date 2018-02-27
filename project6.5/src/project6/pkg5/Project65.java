/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6.pkg5;
import java.util.Scanner;
/**
 *
 * @author triosStudent
 */
public class Project65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       int n1,n2,n3;
        System.out.println("Enter thre  number :");
        n1=input.nextInt();
        n2=input.nextInt();
        n3=input.nextInt();
        displaySortedNumber(n1,n2,n3);
       
    }
    public static void displaySortedNumber(int num1,int num2,int num3)
    {
        int max=0,min=0,med=0;
         if (num1>num2)
        {
            if(num1>num3)
            {
                max=num1;
            }
            else{
                max=num3;
                med=num1;
                min=num2;
            }
            
            
        }
        else if (num2>num1)
        {
            if(num2>num3)
            {
                max=num2;
            }
            else{
                max=num3;
                med=num2;
                min=num1;
            }
        }
        else if (num2>num1)
        {
            if(num2<num3)
            {
                max=num3;
            }
            else{
                min=num1;
                med=num2;
                max= num3;
            }
        }
        
        System.out.println("The sort number from: "+num1+" and "+num2+" and "+num3+" is\n "
                +min+" , "+med+" , "+max);
    }
}
