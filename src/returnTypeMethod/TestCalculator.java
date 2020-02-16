package returnTypeMethod;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator1 cal1 = new Calculator1();
		cal1.addition();
		cal1.substruction();
		
		Calculator2 cal2 = new Calculator2();
		cal2.addition();
		cal2.substruction();
		
		Calculator3 cal3 = new Calculator3();
		cal3.addition(25, 45);
		cal3.substruction(60, 20);
		
		Calculator4 cl4 = new Calculator4();
		cl4.addition(5, "10");

	}

}
