/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3.pkg8.pkg2;
import java.util.Scanner;
/**
 *
 * @author triosStudent
 */
public class Project382 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,num3,min = 0,med = 0,max = 0;
        Scanner input= new  Scanner (System.in);
        System.out.println("Enter three number :");
        num1=input.nextInt();
        num2=input.nextInt();
        num3=input.nextInt();
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
        
      System.out.println("The sort is :" + min + " , " + med + " , "+ max );
    }
    
}
