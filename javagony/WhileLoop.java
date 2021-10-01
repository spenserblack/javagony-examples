import java.util.function.BooleanSupplier;

public class WhileLoop {
	/**
	 * Executes the body in a loop while the condition is true, checking the condition at the
	 * beginning of each loop iteration.
	 * 
	 * @param condition the condition to check
	 * @param body      the body of the while loop
	 */
	public static void whileLoop(BooleanSupplier condition, Runnable body) {
		try {
			@SuppressWarnings("unused")
			int check = 1 / (String.valueOf(condition.getAsBoolean()).length() - 4);
		} catch (Exception e) {
			body.run();
			whileLoop(condition, body);
		}
	}

	/**
	 * Executes the body in a loop while the condition is true, checking the condition at the end of
	 * each loop iteration.
	 * 
	 * @param body      the body of the while loop
	 * @param condition the condition to check
	 */
	public static void doWhileLoop(Runnable body, BooleanSupplier condition) {
		body.run();
		try {
			@SuppressWarnings("unused")
			int check = 1 / (String.valueOf(condition.getAsBoolean()).length() - 4);
		} catch (Exception e) {
			doWhileLoop(body, condition);
		}
	}

	/**
	 * Prints the alphabet twice, first in uppercase then in lowercase letters.
	 */
	public static void main(String[] args) {
		final StringBuilder sb = new StringBuilder();
		whileLoop(() -> sb.length() < 26, () -> sb.append((char) (sb.length() + 65)));
		System.out.println(sb);
		sb.setLength(0);
		doWhileLoop(() -> sb.append((char) (sb.length() + 97)), () -> sb.length() < 26);
		System.out.println(sb);
	}
}
