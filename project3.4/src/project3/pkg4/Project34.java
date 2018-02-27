/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3.pkg4;
import java.util.Scanner;

/**
 *
 * @author triosStudent
 */
public class Project34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner imput=new Scanner (System.in);
        int number = (int) ((Math.random() * 12) + 1);
        String month;
        switch (number)
        {
            case 1 :
                month="January";
                System.out.println("The choosed month is: " +month);
                break;
                case 2:
                 month= "February";
                System.out.println("The choosed month is:" +month);
                break;
                case 3 :
                month="march";
                System.out.println("The choosed month is: "+month);
                break;
                case 4 :
                    month="April";
                System.out.println("The choosed month is: " +month);
                break;
                case 5 :
                System.out.println("The choosed month is May");
                break;
                case 6 :
                System.out.println("The choosed month is June");
                break;
                case 7 :
                System.out.println("The choosed month is July");
                break;
                case 8 :
                System.out.println("The choosed month is Agust");
                break;
                case 9 :
                System.out.println("The choosed month is September");
                break;
                case 10 :
                System.out.println("The choosed month is October");
                break;
                case 11 :
                System.out.println("The choosed month is November");
                break;
                case 12 :
                System.out.println("The choosed month is December");
                break;
        }
        
    }
    
}
