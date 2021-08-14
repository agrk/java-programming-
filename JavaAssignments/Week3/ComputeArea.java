
package week3;

/**
 *
 * @author Asile
 */

import java.util.Scanner;

public class ComputeArea {

    public static void main(String[] args) {
        
        double radius;
        double area;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius Value: ");
        radius = input.nextDouble();
        
        //Compute Area
        area = radius * radius * 3.14159;
        
        //Display Results
        System.out.println("The area for the circle of Radius " 
                + radius + " is " + area);
    }
    
}
