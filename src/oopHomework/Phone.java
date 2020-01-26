package oopHomework;

public interface Phone extends Pager, Wakitaki {
	
	

  //  String Name = "Tofael"; 
//	
//	public final String CompanyName = "Mohammad Sharkar";
//
//	public static int value = 10000000;
//	public int salary = 10000;
	
	
	public void interfaceInfo(); 

	public void call(); 

	public void message();
	
	public void camera();

	public default void battery() {
		System.out.println("battery is a deault method from Java 1.8");
	}

	public static void wireless() {
		System.out.println("wireless is a static method from Java 1.8");
	}

}
