package abstraction01;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Toyota ();
		car.start();
		car.stop();
		car.brake();
		car.honk();
		
		Car.gear();
		
		Toyota camry = new Toyota();
		camry.start();
		camry.stop();
		camry.brake();
		camry.honk();
		
		camry.autopilot();
		camry.flyingFeatures();
		
		camry.battery();
		camry.size();
		camry.shape();
		camry.hoverInfo();
		
		//camry.strongBattery();
		
		FlyingCar helloKitty = new Toyota();
		helloKitty.autopilot();
		helloKitty.flyingFeatures();
		
        FlyingObject fo = new Toyota();
		fo.shape();
		
		Drone dr = new Toyota();
		dr.size();
		
//	    Car car2 = new Mercedes();
//		car2.start();
//		car2.stop();
//		car2.brake();
		
        Mercedes fmatic = new Mercedes();
		fmatic.start();
		fmatic.stop();
		
		fmatic.battery();
		
		fmatic.carryingGoods();
		fmatic.carryingPassenger();
		fmatic.smoothness();
		fmatic.strongness();
	}

}
