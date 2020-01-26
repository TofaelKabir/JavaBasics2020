package oopHomework;

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {
	public AppleWatch(){
		System.out.println("Deafult constrcutor from Abstract Class");
	}
	public void abstractClassInfo() {
		System.out.println("An Abstract class can extends a regular class or an abstract class and implements more than one Interface");
	}
	public abstract void appleWatchInfo();

}
