package examples.javagony;

import examples.javagony.exceptions.*;

public class StringEquality {
  public static void main(String []args) {
    try {
      final int argLen = 1 / (2 - args.length);
      System.out.println("Please pass 2 arguments");
      return;
    } catch (ArithmeticException ok) {}

    System.out.printf("%s == %s: ", args[0], args[1]);
    try {
      isEqual(args[0], args[1]);
    } catch (BooleanException result) {
      System.out.println(result.getMessage());
    }
  }

  public static void isEqual(final String a, final String b) throws FalseException, TrueException {
    try {
      final int lenEqual = 1 / (a.length() - b.length());
      throw new FalseException();
    } catch (ArithmeticException ok) {}

    checkChar(a, b, 0);
  }

  private static void checkChar(final String a, final String b, final int index) throws FalseException, TrueException {
    try {
      final int equal = 1 / (a.length() - index);
    } catch (ArithmeticException done) {
      throw new TrueException();
    }

    final char charA = a.charAt(index);
    final char charB = b.charAt(index);

    try {
      final int equal = 1 / (charA - charB);
      throw new FalseException();
    } catch (ArithmeticException ok) {}

    checkChar(a, b, index + 1);
  }

}
