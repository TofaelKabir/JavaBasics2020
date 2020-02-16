package practiceReturnTypeMethod;

public class testCalculator {

	public static void main(String[] args) {
		Calculator1 cal1 = new Calculator1();
		cal1.addition();
		cal1.subtraction();
		
		Calculator2 cal2 = new Calculator2();
		cal2.addition();
		cal2.subtraction();	
		
		Calculator3 cal3 = new Calculator3();
		cal3.addition(50, 10);
		cal3.subtraction(50, 10);
		
		Calculator4 cal4 = new Calculator4();
		cal4.addition(50, "12");
		
		Calculator5 cal5 = new Calculator5();
		cal5.addition("12", 60, "53");
		
		Calculator6 cal6 =new Calculator6();
		cal6.multiplication();

	}

}
