package examples.javagony.exceptions;

public abstract class BooleanException extends Exception {
  public BooleanException() {
    super();
  }

  public BooleanException(final String message) {
    super(message);
  }
  public void reverse() throws BooleanException {};
  public void reverse(final String message) throws BooleanException {};
}
