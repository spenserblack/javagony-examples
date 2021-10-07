package javagony;

public class OddOrEvenChecker {
  public static void main(String[] args) {
    final int number;
    try {
      number = Integer.parseInt(args[0]);
    } catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
      System.out.println("Please pass a number in the command-line");
      return;
    }

    try {
      int remainder = 1/(number%2);
      System.out.printf("%d is odd\n", number);
    } catch(ArithmeticException e) {
      System.out.printf("%d is even\n", number);
    }
  }
}
