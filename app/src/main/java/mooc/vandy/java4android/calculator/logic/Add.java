package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add {
    private int argOne = 0;
    private int argTwo = 0;

    public Add(int argumentOne, int argumentTwo) {
        argOne = argumentOne;
        argTwo = argumentTwo;
    }

    public String toString() {
        return String.valueOf(argOne + argTwo);
    }

}
