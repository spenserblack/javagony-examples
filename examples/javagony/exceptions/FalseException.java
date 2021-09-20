package examples.javagony.exceptions;

public class FalseException extends BooleanException {
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
