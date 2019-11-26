package practice2;

public class Computer {
	
	public String OperatingSystem; //variable declared
	public int price;
	
	public void configuration(){ //method implemented
	//void type method or non return method or non static method, simplest presentation of method
	//method name always in small letter	
	//after method name there is ()
	System.out.println("My operating system is: " + OperatingSystem + " And the price is: " + price + "$" ); //concatenation - joining of 2 or 3
	
	}
	
	
	

	public static void main(String[] args) {
		Computer computer = new Computer(); // instantiation of Class, creation of object (pc)
		computer.OperatingSystem = "Windows"; //object help to initialize variable
		computer.price = 1200;
		computer.configuration(); //object can initialize method
		
		Computer tofael = new Computer();
		
		
		Computer shohan = new Computer();
		
		

	}

}
//Java is all about class and object