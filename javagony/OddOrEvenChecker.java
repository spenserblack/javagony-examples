public class OddOrEvenChecker {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        try{
            int remainder = 1/(number%2);
            System.out.print(number+" is odd");
        }
        catch(ArithmeticException e){
            System.out.print(number+" is even");
        }
    }
}
