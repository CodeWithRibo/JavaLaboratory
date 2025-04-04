package Activity.Enumaration;

public class CarDemo {

	public static void main(String[] args) {

		Car objectCarOne = new Car(1995, Model.SEDAN, Color.GREEN);
		objectCarOne.display();

		System.out.println();

		Car objectCarTwo = new Car(2005, Model.SUV, Color.LUNAGRAY);
		objectCarTwo.display();

	}

}
