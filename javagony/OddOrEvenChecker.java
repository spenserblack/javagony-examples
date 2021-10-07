import java.util.Scanner;

public class OddOrEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        try{
            int remainder = 1/(number%2);
            System.out.print(number+" is odd");
        }
        catch(ArithmeticException e){
            System.out.print(number+" is even");
        }
    }
}
