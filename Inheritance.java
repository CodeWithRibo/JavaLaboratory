package Activity;

class Surname {
	private String surName;

	public void setSurName(String surName) {
		this.surName = surName;
	}

	// getter method for the parent class
	public String getSurName() {
		return surName;
	}

	// display method for the parent class
	public void displayFullName() {
		System.out.println(surName);
	}

	public void habbit() {
		System.out.println("I like to play soccer");
		System.out.println("I want to be a Fullstack Developer");
		System.out.println("My height is 5'5");
		System.out.println("Crush ko si? E.M");
	}
}

class Firstname extends Surname {
	private String firstName;

	// constructor or setter method for the child class
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override // override the parent class method
	public void displayFullName() {
		System.out.print("Hello My name is " + firstName + " ");
		super.displayFullName();
	}

	@Override
	public void habbit() {
		super.habbit();
	}
}

public class Inheritance {

	public static void main(String[] args) {

		Firstname obj = new Firstname();
		// set arguments
		obj.setFirstName("CarlJohn");
		obj.setSurName("Sto Tomas");

		// display FullName and Habbit
		obj.displayFullName();
		System.out.println();
		obj.habbit();

	}

}
