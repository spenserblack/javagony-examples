package javagony;

import static java.lang.Math.abs;

public class FactorialOfANumber {
    public static void main(String[] args) {
        final int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Please pass a number in the command-line");
            return;
        }
        try{
            int check=1/(number+abs(number));
        }catch (Exception e){
            try{
                int check = 1/number;
            }catch(Exception exception)
            {
                System.out.println(factorial(number));
                return;
            }
            System.out.println("Please pass a positive number in the command-line");
            return;
        }
        System.out.println(factorial(number));

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

