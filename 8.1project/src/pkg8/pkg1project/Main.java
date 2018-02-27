/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.pkg1project;
import java.util.Scanner;
        
/**
 *
 * @author triosStudent
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int  m=0,n=0;
        System.out.println("enter two number  for row and column for array: ");
        m=input.nextInt();
        n=input.nextInt();
        double [][] myArray=new double[m][n];
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter the value for the Array ["+i+","+j+"]:"); 
                myArray[i][j]= input.nextDouble();
                System.out.println("The value of the array ["+i+","+j+"] =" +myArray[i][j]);
            }
        }
        System.out.println("Enter a number  for column to total array: ");
        int column =input.nextInt();
        System.out.println("The total with this Column " +column + " is ="+ sumColumn(myArray,column,m));
    }

    
    public static double sumColumn(double[][] mArray,int columnIndex,int m)
    {
        double sumColumn=0;
       
        for (int i=0;i<m;i++)
        {
          sumColumn=sumColumn+mArray[i][columnIndex];
           
        }
        
          return sumColumn;  
    }
    
}
