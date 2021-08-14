
package homework.pkg1;

/**
 *
 * @author Asile
 */

import java.util.Scanner;

public class HomeWork1 {
    
    public static void main(String[] args) {
        int x, y, z;
        int sum;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        int Sayi = input.nextInt();
        
        x = (int)(Sayi / 100);
        Sayi = Sayi % 100;
        y = (int)(Sayi / 10);
        z = (int)(Sayi % 10);
        
        sum = x + y + z;
        
        System.out.println("The sum of the digits is " + sum);
    }
    
}
