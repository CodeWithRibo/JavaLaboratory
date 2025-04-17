package PerformanceTask.RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InputUser {
	Scanner scan = new Scanner(System.in);

	protected String inputOne;
	protected String inputTwo;
	protected List<String> userInputData = new ArrayList<>();

	public void inputUser() {
		String con = "yes";
		while (con.equals("yes")) {
			System.out.print("Enter the first word:");
			inputOne = scan.nextLine();
			System.out.print("Enter the Second word:");
			inputTwo = scan.nextLine();

			userInputData.add(inputTwo + " ryhmes with " + inputOne);
			System.out.print("Gusto mo pa ba ituloy to o tutuluyan kita? [yes/no]: ");
			con = scan.nextLine();
		}

	}

	public void displayUserInput() {
		System.out.println("\nUSER ALL INPUT");
		for (String data : userInputData) {
			System.out.println(data);
		}
	}
}

class InputUserResult extends InputUser {

	@Override
	public void displayUserInput() {

		Pattern pattern1 = Pattern.compile("[A-Za-z]{1,5}(am|at)");
		Matcher matcher1 = pattern1.matcher(inputTwo);
		Matcher matcher2 = pattern1.matcher(inputOne);

		if (matcher1.matches() && matcher2.matches())
			super.displayUserInput();
		else
			System.out.println("I'm not sure! Sorry!");
	}

}

public class RegularExpressions {

	public static void main(String[] args) {

		InputUserResult result = new InputUserResult();
		result.inputUser();
		result.displayUserInput();
	}

}
