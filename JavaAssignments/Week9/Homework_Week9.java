
package homework_week9;
/**
 *
 * @author Asile
 */
public class Homework_Week9 {

    public static void main(String[] args) {
        
            char[][] answers = new char[8][10];

            for(int i=0;i<8;i++) {
                for(int j=0;j<10;j++) {
                    answers[i][j]=(char) (65+Math.random()*5);
                }
            }
            
            char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

          
            for (int i = 0; i < answers.length; i++) {
             
              int correctCount = 0;
              for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                  correctCount++;
              }

              System.out.println("Student " + i + "'s correct count is " +
                correctCount);
            }
    }
    
}
