public class OddOrEvenChecker {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        try{
            int remainder = 1/(number%2);
            System.out.printf("%d is odd\n", number);
        }
        catch(ArithmeticException e){
            System.out.printf("%d is odd\n", number);
        }
    }
}
