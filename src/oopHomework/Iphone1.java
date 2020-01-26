package oopHomework;

public class Iphone1 extends AppleWatch implements Phone {
	
	private int price;
	private String Info;
	private char grade;
	private boolean madeInUSA;
	
	public final String family = "Apple Family";
	
	public Iphone1() {
		System.out.println("Default constructor of Iphone1");
	}
	
	public Iphone1(int price, String info, char grade, boolean madeInUSA) {
		this.price = price;
		this.Info = info;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("Iphone info: price - $"+price+", model - "+info+", grade - "+grade+", Is it made in USA - "+madeInUSA);
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return Info;
	}

	public void setInfo(String info) {
		Info = info;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}
	
	public void regularClassInfo() {
		System.out.println(
				"A regular class can extends (only one) abstract class or a regular class. It can implements (more than one) Interface. Here Iphone1 is called a concrete class. By default methods are non abstract");
	}

	@Override
	public void pager() {
		System.out.println("pager method is implemented");

	}

	@Override
	public void wakitaki() {
		System.out.println("wakitaki method is implemented");

	}

	@Override
	public void interfaceInfo() {
		System.out.println(
				"In interface, the methods are abstract and can be declared, not implemented. An interface can extends more than one Interface but can't implement anyone. From Java 1.8, only default and static method can be implemented. Variables declared in a Java interface are by default final. We can't creat constructor inside Interface");

	}

	@Override
	public void call() {
		System.out.println("Call by Iphone is crystal clear");

	}

	@Override
	public void message() {
		System.out.println("Iphone have imessage");

	}

	@Override
	public void camera() {
		System.out.println("Iphone have high resolution camera");

	}

	@Override
	public void watch() {
		System.out.println("watch method from Watch Interface");
		
	}

	@Override
	public void digitalWatch() {
		System.out.println("digitalWatch method from DigitalWatch Interface");
		
	}

	@Override
	public void appleWatchInfo() {
		System.out.println("Abstract method is declared in Abtract Class, but non-abstract method is implemented");
		
	}

	

}
