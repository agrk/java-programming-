
package week6;

/**
 *
 * @author Asile
 */

import java.util.Scanner;

public class Week6 {

    
    public static void main(String[] args) {
        
        int count = 0;

        while(count < 5){
            
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        Scanner input =new Scanner(System.in);
        
        System.out.println("What is " + number1 + " + " + number2 + " ? ");

        int answer = input.nextInt();
        
          
            while(number1 + number2 != answer){
                System.out.println("Try again, What is " + number1 + " + " + number2 + " ? ");
                answer = input.nextInt();
            }
            
            count ++ ;
        }
        
        System.out.println(count + "Times True!Congratulations");


    
    }
    
}
