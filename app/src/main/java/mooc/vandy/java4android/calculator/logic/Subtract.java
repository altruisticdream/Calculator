package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    private int argOne = 0;
    private int argTwo = 0;

    public Subtract(int argumentOne, int argumentTwo) {
        argOne = argumentOne;
        argTwo = argumentTwo;
    }

    public String toString() {
        if(argOne>=argTwo)
            return String.valueOf(argOne - argTwo);
        else
            return String.valueOf(argTwo - argOne);
    }
}