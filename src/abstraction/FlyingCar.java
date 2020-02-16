package abstraction;

public abstract class FlyingCar extends HoverCar implements Drone, FlyingObject {
	// an Abstract class can extends a regular class or an abstract class and
	// implements more than one Interface
	public final String Owner = "Mohammad Sharkar";

	public static int price = 100;
	public char grade = 'A';

	private boolean madeInUSA = false; // read why yellow
	protected String Name = "FlyingCar the great";

	public FlyingCar() {

	}

	public abstract void autopilot(); // only abstract method is declared

	public void flyingFeatures() { // non-abstract method can be implemented in abstract class, but not in
									// interface
		System.out.println("Flying car is a dream");
	}

}

/*
 * 
 * https://stackoverflow.com/questions/11345061/why-must-a-final-variable-be-
 * initialized-before-constructor-completes/11345103
 * 
 * 
 * 
 * If an instance variable is declared with final keyword, it means it can not
 * be modified later, which makes it a constant. That is why we have to
 * initialize the variable with final keyword.Initialization must be done
 * explicitly because JVM doesnt provide default value to final instance
 * variable.Final instance variable must be initialized either at the time of
 * declaration like:
 * 
 * class Test{ final int num = 10; } or it must be declared inside an instance
 * block like:
 * 
 * class Test{ final int x; { x=10; } } or it must be declared BEFORE
 * constructor COMPLETION like:
 * 
 * class Test{ final int x; Test(){ x=10; } } Keep in mind that we can
 * initialize it inside a consructor block because initialization must be done
 * before constructor completion.
 * 
 * 
 * There are several values in the real world which will never change. A square
 * will always have four sides, PI to three decimal places will always be 3.142,
 * and a day will always have 24 hours. These values remain constant. When
 * writing a program it makes sense to represent them in the same way - as
 * values that will not be modified once they have been assigned to a variable.
 * These variables are known as constants.
 * 
 */
