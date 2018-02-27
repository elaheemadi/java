/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7.pkg2;
import java.util.Scanner;
/**
 *
 * @author triosStudent
 */
public class Project72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int snum=0,i,j;
        int myArray[]=new int[10];
        int sortDescArray[] =new int[10];
        System.out.println("Enter 10 integer number");
        for( i=0;i<myArray.length;i++)
        {
             System.out.print(i+1+"=> ");
             myArray[i]=input.nextInt();
             System.out.println("The constants of myArray[ "
             + i+" ]is " + myArray[i]);
        }
        for( i=0;i<myArray.length;i++)
        {
            for(j=i+1;j<myArray.length;j++)
            {
                if(myArray[i]<myArray[j])
                 snum =myArray[i]  ;
                 myArray[i]=myArray[j];
                 myArray[j]=snum;
                 
            }
        }  
        System.out.println("The sort Array is :");
        for(i=0;i<myArray.length;i++)
        {
            System.out.println("myArray["
             + myArray[i]+"]");
            
        }
    }
    
}
