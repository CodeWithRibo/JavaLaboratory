package Activity.ExceptionHandling;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) {

		try {
			String[] gmpMembers = { "Grant", "Carl", "CarlJohn", "Brent", "Bon", "Aldrey", "Charles", "Ian", "Gunda",
					"Angelo", "Augusto", "Raven", "Bayaw" };
			System.out.println(gmpMembers[13]);

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("This is the end of the program");

		}
	}
}
