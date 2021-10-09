package javagony;

import exceptions.BooleanException;
import exceptions.FalseException;
import exceptions.TrueException;

public class FactorialOfANumber {
    public static void main(String[] args) throws BooleanException {
        final int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Please pass a number in the command-line");
            return;
        }
        try{
              NumericalComparison.lessThan(number,0);
        }catch (TrueException trueException){
            System.out.println("Please pass a positive number in the command-line");
        } catch (FalseException falseException) {
            System.out.println(factorial(number));
        }


    }

    private static int factorial(int number) {
        try {
            int check = 1/number;
            return number * factorial(number-1);
        }catch (Exception e){
            return 1;
        }
    }
}


