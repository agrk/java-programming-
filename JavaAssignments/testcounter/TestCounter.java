
package testcounter;

/**
 *
 * @author Asile
 */
public class TestCounter {

    private int value;
    public void increment(){
        value++;
    }
    public int getValue() {
        return value;
    }

public static void main(String[] args) {

    TestCounter headCount, tailCount;
    tailCount = new TestCounter();
    headCount = new TestCounter();
    for ( int flip = 0; flip < 100; flip++ ) {
        if (Math.random() < 0.5) // There's a 50/50 chance that this is true.
            headCount.increment(); // Count a "head".
        else
            tailCount.increment(); // Count a "tail".
        }
    System.out.println("There were " + headCount.getValue() + " heads.");
    System.out.println("There were " + tailCount.getValue() + " tails.");
    }
    
}
