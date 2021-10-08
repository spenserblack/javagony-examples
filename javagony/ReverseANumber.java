package javagony;

public class ReverseANumber {
    public static void reverse(int number,int reversedNumber){
        try{
            int check = 1/(number);
            int digit = number % 10;
            reversedNumber = reversedNumber*10 + digit;
            reverse(number/10,reversedNumber);
        }
        catch(Exception e) {
            System.out.println(reversedNumber);
        }

    }

    public static void main(String[] args) {
        final int number;
        try {
            number = Integer.parseInt(args[0]);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Please pass a number in the command-line");
            return;
        }
        reverse(number,0);

    }
}
