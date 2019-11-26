package constructor;

public class Computer2 { //opening of class body by curly brace
	String brandAndModel; //variable declared
    String operatingSystem;
	int price;
	char category;
	boolean madeInUsa;
	static int reveiwNumber;
	public Computer2(String brandAndModel, String operatingSystem, int price, char category, boolean madeInUsa) {
		super();
		this.brandAndModel = brandAndModel;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.category = category;
		this.madeInUsa = madeInUsa;
		System.out.println("Computer Configuration for one of them is : "+brandAndModel+" "+operatingSystem+ " "+price+" "+category );
	}
	
    
}//closing of class body by curly brace
