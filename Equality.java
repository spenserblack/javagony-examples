public class Equality {
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
  }
  
  public static void isEqual(final int a, final int b) throws TrueException, FalseException {
    try {
      final int equalityCheck = 1 / (a - b);
    } catch (ArithmeticException eq) {
      throw new TrueException();
    }
    throw new FalseException();
  }
  
  static class TrueException extends Exception {
    public TrueException() {
      super("true");
    }
    public TrueException(final String message) {
      super(message);
    }
  }

  static class FalseException extends Exception {
    public FalseException() {
     super("false");
    }
    public FalseException(final String message) {
      super(message);
    }
  }
}
