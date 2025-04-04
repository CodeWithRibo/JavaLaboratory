package Activity.Enumaration;

public class Car {

	private int year;
	private Model model;
	private Color color;

	public Car(int year, Model model, Color color) {
		this.year = year;
		this.model = model;
		this.color = color;
	}

	public int getYear() {
		return this.year;
	}

	public Model getModel() {
		return this.model;
	}

	public Color getColor() {
		return this.color;
	}

	public void display() {
		int displayYear = this.year;
		Model displayModel = this.model;
		Color displayColor = this.color;

		System.out.println("Year: " + displayYear);
		System.out.println("Model: " + displayModel);
		System.out.println("Color: " + displayColor);

	}
}
