public class OddOrEvenChecker {
    public static void main(String[] args) {
        try{
            int number = Integer.parseInt(args[0]);
            int remainder = 1/(number%2);
            System.out.printf("%d is odd\n", number);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Please pass a number in the command-line");
            return;
        } catch(ArithmeticException e){
            System.out.printf("%d is odd\n", number);
        }
    }
}
