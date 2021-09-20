public class NumericalComparison {
  public static void main(String []args) {
    final int a = 1;
    final int b = 0;
    final int c = 1;
    try {
      isEqual(a, b);
    } catch (Exception e) {
      System.out.printf("%d == %d is %s\n", a, b, e.getMessage());
    }
    try {
      isEqual(a, c);
    } catch (Exception e) {
      System.out.printf("%d == %d is %s\n", a, c, e.getMessage());
    }

    try {
      lessThan(0, 10);
    } catch (Exception e) {
      System.out.printf("0 < 10 is %s\n", e.getMessage());
    }
    try {
      lessThan(10, 0);
    } catch (Exception e) {
      System.out.printf("10 < 0 is %s\n", e.getMessage());
    }
    try {
      lessThan(10, 10);
    } catch (Exception e) {
      System.out.printf("10 < 10 is %s\n", e.getMessage());
    }
    try {
      lessThan(-10, 0);
    } catch (Exception e) {
      System.out.printf("-10 < 0 is %s\n", e.getMessage());
    }
    try {
      lessThan(0, -10);
    } catch (Exception e) {
      System.out.printf("0 < -10 is %s\n", e.getMessage());
    }
    try {
      lessThan(-10, -10);
    } catch (Exception e) {
      System.out.printf("-10 < -10 is %s\n", e.getMessage());
    }

    try {
      greaterThan(0, 10);
    } catch (Exception e) {
      System.out.printf("0 > 10 is %s\n", e.getMessage());
    }
    try {
      greaterThan(10, 0);
    } catch (Exception e) {
      System.out.printf("10 > 0 is %s\n", e.getMessage());
    }
    try {
      greaterThan(10, 10);
    } catch (Exception e) {
      System.out.printf("10 > 10 is %s\n", e.getMessage());
    }
    try {
      greaterThan(-10, 0);
    } catch (Exception e) {
      System.out.printf("-10 > 0 is %s\n", e.getMessage());
    }
    try {
      greaterThan(0, -10);
    } catch (Exception e) {
      System.out.printf("0 > -10 is %s\n", e.getMessage());
    }
    try {
      greaterThan(-10, -10);
    } catch (Exception e) {
      System.out.printf("-10 > -10 is %s\n", e.getMessage());
    }
  }

  public static void isEqual(final int a, final int b) throws TrueException, FalseException {
    try {
      final int equalityCheck = 1 / (a - b);
    } catch (ArithmeticException eq) {
      throw new TrueException();
    }
    throw new FalseException();
  }

  /**
   * Recursively bit shifts values until a is zero (0x00000000) or minimum value (0xFFFFFFFF),
   * or a and b are equal.
   */
  public static void lessThan(final int a, final int b) throws BooleanException {
    // NOTE False if equal
    try {
      isEqual(a, b);
    } catch (TrueException t) {
      t.reverse();
    } catch (FalseException f) {}

    // Sign is 0 if positive
    final int aSign = a & Integer.MIN_VALUE;
    final int bSign = b & Integer.MIN_VALUE;

    // If a < 0 and b >= 0, a < b is true
    try {
      final int check = 1 / bSign;

      try {
        final int check2 = 1 / aSign;
      } catch (ArithmeticException aPositive) {
        // b < 0, a >= 0
        throw new FalseException();
      }
    } catch (ArithmeticException bPositive) {
      try {
        final int check = 1 / aSign;
        // a < 0, b >= 0
        throw new TrueException();
      } catch (ArithmeticException aPositive) {
      }
    }

    try {
      isEqual(a, 0xFFFFFFFF);
    } catch(TrueException t) {
      throw t;
    } catch (FalseException f) {}
    try {
      isEqual(a, 0x00000000);
    } catch (TrueException t) {
      throw t;
    } catch (FalseException f) {}

    lessThan(a >> 1, b >> 1);
  }

  /**
   * Not less than and not equal
   */
  public static void greaterThan(final int a, final int b) throws BooleanException {
    try {
      isEqual(a, b);
    } catch (TrueException t) {
      t.reverse();
    } catch (FalseException f) {}

    try {
      lessThan(a, b);
    } catch (BooleanException lt) {
      lt.reverse();
    }
  }

  static abstract class BooleanException extends Exception {
    public BooleanException() {
      super();
    }

    public BooleanException(final String message) {
      super(message);
    }
    public void reverse() throws BooleanException {};
    public void reverse(final String message) throws BooleanException {};
  }

  static class TrueException extends BooleanException {
    public TrueException() {
      super("true");
    }
    public TrueException(final String message) {
      super(message);
    }

    public void reverse() throws FalseException {
      throw new FalseException();
    }
    public void reverse(final String message) throws FalseException {
      throw new FalseException(message);
    }
  }

  static class FalseException extends BooleanException {
    public FalseException() {
     super("false");
    }
    public FalseException(final String message) {
      super(message);
    }

    public void reverse() throws TrueException {
      throw new TrueException();
    }
    public void reverse(final String message) throws TrueException {
      throw new TrueException(message);
    }
  }
}
