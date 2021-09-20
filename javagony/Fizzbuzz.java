package javagony;

public class Fizzbuzz {
  public static void main(String[] args) {
    final int loopCount;
    try {
      int lenCheck = 1 / args.length;
      loopCount = Integer.parseInt(args[0]);
    } catch (ArithmeticException | NumberFormatException e) {
      System.out.println("Please pass an int.");
      return;
    }
    fizzbuzz(loopCount + 1, 1);
  }

  private static void fizzbuzz(final int loopMax, final int loopCount) {
    try {
      int loopCheck = 1 / (loopMax - loopCount);
    } catch (ArithmeticException e) {
      return;
    }
    System.out.printf("%d: ", loopCount);
    try {
      int fizzCheck = 1 / (loopCount % 3);
    } catch (ArithmeticException fizz) {
      try {
        int buzzCheck = 1 / (loopCount % 5);
        System.out.println("fizz");
      } catch (ArithmeticException buzz) {
        System.out.println("fizzbuzz");
      }
      fizzbuzz(loopMax, loopCount + 1);
      return;
    }
    try {
      int buzzCheck = 1 / (loopCount % 5);
      System.out.println(loopCount);
    } catch (ArithmeticException buzz) {
      System.out.println("buzz");
    }
    fizzbuzz(loopMax, loopCount + 1);
  }
}
