package Activity.ExceptionHandling;

import java.util.ArrayList;

public class IndexOutOfBound {

	public static void main(String[] args) {

		ArrayList<String> favoriteColor = new ArrayList<>();

		favoriteColor.add("Dark Blue");
		favoriteColor.add("Black");
		favoriteColor.add("White");
		favoriteColor.add("Red");
		favoriteColor.add("Sky Blue");
		try {
			int i = 0;
			while (i <= favoriteColor.size()) { // Throw an exception because of the <= not strickly
				System.out.println(favoriteColor.get(i));
				i++;
			}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace(); // calling the identifier e to see the exception message hehe ^_^
		} finally {
			System.out.println("The program has been terminated.");
		}

	}
}
