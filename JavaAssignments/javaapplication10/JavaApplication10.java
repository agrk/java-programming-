
package javaapplication10;

/**
 *
 * @author Asile
 */
import java.util.Scanner;
public class JavaApplication10 {

    public static void main(String[] args) {
	int a=0;
        do{
         Scanner input=new Scanner(System.in);
        
        int dice1=(int)(Math.random()*6)+1;
        int dice2=(int)(Math.random()*6)+1;
            System.out.println("1.dice="+dice1+ "\t 2.dice=" +dice2 );
           
        if(dice1==1 && dice2==1){
            System.out.println("\n1 1 SNAKE EYES");
        break;
            }
        a++;
        }while(true);
        System.out.println("Number of rolls that it makes before the snake eyes="+a);
        System.out.println("Dices rolled "+(a+1)+" times");
        

    }

}    
}
