
package homework_week6;

/**
 *
 * @author Asile
 */
public class HomeWork_Week6 {

    
   public static void main(String[] args) {
 
        int dice1 , dice2;
        int Counter;
        Counter = 0;
        
        do{
            dice1 = 1 + (int)(Math.random() * 6 );
            dice2 = 1 + (int)(Math.random() * 6 );
            
            //System.out.println("1.dice=" + dice1 + "\t 2.dice=" + dice2 );
            
            Counter++;
        }
        while(dice1 != 1 || dice2 != 1);
        
        System.out.println(Counter + " rolls to get snake eyes.");    
    }
    
    
}
