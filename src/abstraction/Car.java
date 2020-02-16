package abstraction;

public interface Car extends Taxi, Van {
	
	//an Interface can extends more than one Interface 
	//but can't extends or implements abstract class or regular class

	String Name = "Tofael"; // public static final is only possible
	// Variables declared in a Java interface are by default final.
	public final String CompanyName = "Mohammad Sharkar";

	public static int value = 10000000;
	public int salary = 10000;
	
	//can interface have constructor? Why not?
	
	public void start(); // in interface the methods are abstract and can be declared, not implemented

	public void stop(); // only default and static method can be implemented

	public void brake();

	public default void honk() { // implemented
		System.out.println("The honk is hydrolic for everyone");
	}

	public static void gear() {
		System.out.println("Gear is automatic for all");
	}

}
