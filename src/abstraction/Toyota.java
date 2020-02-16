package abstraction;

public class Toyota extends FlyingCar implements ElectricCar, Car, Tesla {

	// class can extends (only one) abstract class or a regular class but not an
	// interface
	// class can implements (more than one) Interface but not an abstract class or a
	// regular class
	// here Toyota is a concrete class

	public void start() { // method implemented here
		System.out.println("We will use key to ignite the car");
	}

	public void stop() {
		System.out.println("We will use key to turn off the car");
	}

	public void brake() {
		System.out.println("Our brake is manual");
	}

	public void autopilot() {
		System.out.println("This features is coming from flying car");
	}

	public void battery() {
		System.out.println("Battery is improving for Toyota but not improving much");

	}

	public void size() {
		System.out.println("The drone should be small in size to fly well");

	}

	public void shape() {
		System.out.println("no square shape, speed will be down, need spherical shape");

	}

	@Override
	public void strongBattery() {
		System.out.println("We will borrow strong battery from Tesla via Car");

	}

	@Override
	public void rent() {
		System.out.println("Taxi driver has to pay 700$ weekly rent");

	}

	@Override
	public void carryingPassenger() {
		System.out.println("Taxi is used to carry passenger from here to there");

	}

	@Override
	public void carryingGoods() {
		System.out.println("Van is used to carrying goods");

	}

}
