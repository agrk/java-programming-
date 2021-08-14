
package homework_week5;

/**
 *
 * @author Asile
 */

import java.util.Scanner;


public class HomeWork_Week5 {

    public static void main(String[] args) {
     
        int number = 1+ (int)(Math.random() * 7 ); 
        
        System.out.println("Day number: " + number);
        
        switch(number){
            case 1: System.out.println("The Day is Monday"); break;
            case 2: System.out.println("The Day is Tuesday"); break;
            case 3: System.out.println("The Day is Wednesday"); break;
            case 4: System.out.println("The Day is Thursday"); break;
            case 5: System.out.println("The Day is Friday"); break;
            case 6: System.out.println("The Day is Saturday"); break;
            case 7: System.out.println("The Day is Sunday"); break;
            default: System.out.println("Invalid Day Range");
            
            
        }
    }
    
}
