package oopHomework;

public class Iphone2 extends Iphone1{
	public Iphone2() {
		//super();
		super(850, "Iphone2", 'A', false);
		super.regularClassInfo();
		super.interfaceInfo();
		super.abstractClassInfo();
		System.out.println("The family of Iphone2 is: "+super.family);
		System.out.println("Default constructor of Iphone2");
	}

}
