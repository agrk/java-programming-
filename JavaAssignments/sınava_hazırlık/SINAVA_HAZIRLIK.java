
package sınava_hazırlık;

/**
 *
 * @author Asile
 */
import java.util.Scanner;

public class SINAVA_HAZIRLIK {

  
    public static void main(String[] args) {
     
       Scanner input = new Scanner(System.in);
       System.out.print("enter monthly rate: ");
       double MonthlyRate = input.nextDouble();
       
       System.out.print("enter yearly rate: ");
       double YearlyRate = input.nextDouble();
       
       System.out.print("number of years: ");
       int numberOfyear = input.nextInt();
       
       System.out.print("loan amount: ");
       double loanAmount = input.nextInt();
       
       double monthlyPayment = loanAmount * MonthlyRate / (1 - 1 / Math.pow(1 + MonthlyRate, numberOfyear * 12 ));
       double totalPayment = monthlyPayment * numberOfyear * 12 ;
       
        System.out.println("The monthly payment is $" + 
        (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment is $" + 
        (int)(totalPayment * 100) / 100.0);
       
    }
    
}
