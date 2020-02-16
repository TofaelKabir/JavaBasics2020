package constructor;

public class Car {
	public String Brand; //Class variable
	public int mileage;
	public char drive;
	public boolean madeInUSA;
	
	//default constructor or no argument constructor
	public Car() { //constructor declared
		System.out.println("This is from default constructor");
	}
	//you can't write a parameterized constructor without writing default constructor
	//parameterized constructor
	public Car(String Brand, int mileage) { //local variable
		this.Brand=Brand;
		this.mileage=mileage;
		System.out.println("Tanzina's car is: "+Brand+" and the mileage is: "+mileage);
	}
	public Car(String brand, int mileage, char drive) {
		//super();
		this.Brand = brand;
		this.mileage = mileage;
		this.drive = drive;
		System.out.println("Narasing's car is: "+Brand+" and the mileage is: "+mileage+ ", and it is forward drive: "+drive);
	}
	public Car(String brand, int mileage, char drive, boolean madeInUSA) {
		//super();//will explain later
		this.Brand = brand;
		this.mileage = mileage;
		this.drive = drive;
		this.madeInUSA = madeInUSA;
		System.out.println("Charle's car is: "+Brand+" and the mileage is: "+mileage+" "
				+ "Reverse drive: "+drive+ "Build in USA? Ans: "+madeInUSA);
	}

}
