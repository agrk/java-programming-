
/**
 *
 * @author Asile
 */
import java.util.Scanner;

public class String_Type {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        //String username;
        String upperCase;
        
        System.out.print("Enter your name: ");
        String username = input.nextLine();
        upperCase = username.toUpperCase();
        
        System.out.println("Hello, " + upperCase + " having fun while learning Java!");
        
        
    }
    
}
