
package week5;

/**
 *
 * @author Asile
 */

import java.util.Scanner;
public class Week5 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = (int)(Math.random() * 10 );
        int number2 = (int)(Math.random() * 10 );
        int temp;
        if(number1 < number2){
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        System.out.println("What is " + number1 + " - " + number2 + " ? ");
        int answer = scanner.nextInt();
        
        if(number1 - number2 == answer){
            System.out.println("Your answer is correct !! ");
        }
        else{
            System.out.println("Your answer is wrong ! \n" + number1 + " - " + number2 + " should be " + (number1 - number2) );
        }
    }
    
}
