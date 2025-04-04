package Activity.ExceptionHandling;

class divide {
	private int numOne;
	private int numTwo;

	public int setDivide(int numOne, int numTwo) {
		this.numOne = numOne;
		this.numTwo = numTwo;
		return getDivide();
	}

	public int getDivide() {
		if (numTwo == 0) {
			throw new java.lang.RuntimeException("Cannot divide by zero.");
		}
		return numOne / numTwo;
	}

}

public class RuntimeException {

	public static void main(String[] args) {
		divide divide = new divide();

		try {
			int result = divide.setDivide(20, 0);
			System.out.println(result);

		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("The program has been terminated.");
		}
	}
}
