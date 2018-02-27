/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects5.pkg4;

/**
 *
 * @author triosStudent
 */
public class Projects54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       final double MILE=1.609;
       double miles=1,kilometers=1.609;
       
       System.out.printf("Miles                             kilometers\n"); 
       while(miles<=10)
       {
           
           System.out.printf("%.0f                                   %.3f\n"
           ,miles, kilometers);
           miles=miles+1;
           kilometers=miles * MILE;
       }
    }
    
}
