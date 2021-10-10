package javagony;
import javagony.exceptions.*;

public class NthFibonacciNumber {
    public static void main(String[] args) throws BooleanException {
        final int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Please pass a number in the command-line");
            return;
        }
        try {
            NumericalComparison.lessThan(number, 0);
        } catch (TrueException trueException) {
            System.out.println("Please pass a positive number in the command-line");
        } catch (FalseException falseException) {
            System.out.println(fibonacci(number));
        }

    }

    private static int fibonacci(int number) throws BooleanException {
        try {
            NumericalComparison.lessThan(number, 2);
        } catch (TrueException t) {
            try {
                NumericalComparison.isEqual(number, 1);
            } catch (TrueException trueException) {
                return 1;
            } catch (FalseException falseException) {
                return 0;
            }
        } catch (FalseException f) {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
        return 0;
    }
}
