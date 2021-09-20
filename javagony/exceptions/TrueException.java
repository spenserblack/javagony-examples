package javagony.exceptions;

public class TrueException extends BooleanException {
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
