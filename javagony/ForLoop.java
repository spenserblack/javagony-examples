package javagony;

public class ForLoop {
  public static void main(String []args) {
    example(10);
  }

  /**
   * Prints from 0 (inclusive) to max (exclusive).
   */
  public static void example(final int max) {
    forLoop(0, max);
  }

  private static void forLoop(final int i, final int max) {
    try {
      final int loopCheck = 1 / (max - i);
    } catch (ArithmeticException done) {
      return;
    }
    System.out.println(i);
    forLoop(i + 1, max);
  }
}
