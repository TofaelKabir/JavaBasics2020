package constructor;

public class TestCar {

	public static void main(String[] args) {
		Car cr1 = new Car(); //default constructor initialize
		Car cr2 = new Car("Nissan", 14000);
		Car cr3 = new Car("Toyota", 20000, 'F');
		Car cr4 = new Car("Ford", 2000, 'R', true);
		Car cr5 = new Car("Lexus", 45000, 'F', false);

	}

}
