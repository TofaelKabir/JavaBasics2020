package homeWork;

public class Computer { //opening of class body by curly brace
	String brandAndModel; //variable declared
        String operatingSystem;
	int price;
	char category;
	boolean madeInUsa;
	static int reveiwNumber;
	
    public Computer () { //default constructor (constructor 1) declared
    	System.out.println("This is from default constructor and it describes below Tofael's computer");
    }
    public Computer (String brandAndModel) { //constructor 2 is declared
    	this.brandAndModel = brandAndModel;
    	System.out.println("Somone's computer brand and model is: "+brandAndModel);
    }
    public Computer(String brandAndModel, String operatingSystem, int price, char category) {//constructor 3 is declared
    	this.brandAndModel = brandAndModel;
    	this.operatingSystem = operatingSystem;
    	this.price = price;
    	this.category = category;
    	System.out.println("Computer Configuration for one of them is : "+brandAndModel+" "+operatingSystem+ " "+price+" "+category );
    }
    public void computerConfiguration() {
	System.out.println(brandAndModel+", "+operatingSystem +", price: "+price+ ", Category type:  "+category);
    }
    public void setReveiwNumber(int reveiwNumber) {
        Computer.reveiwNumber = reveiwNumber;
    }
    public int getReveiwNumber() {
        return reveiwNumber;
    }
    public static void aboutComputer() {
    	System.out.println("Our coding for Computer is over here");
    }

}//closing of class body by curly brace
