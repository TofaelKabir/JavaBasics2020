package abstraction01;


	public class Mercedes extends Jaguar implements Car, ElectricCar {

		
		public void start() {
			System.out.println("Turn on by power button");
		}
	    public void stop() {
			System.out.println("turn off by power button");
		}
	    public void brake() {
			System.out.println("Automatic break");
		}
		public void battery() {
			System.out.println("Battery is really powerful");
		}

		@Override
		public void carryingPassenger() {
			System.out.println("Mercedes bring taxi car service for VIA");
			
		}
		@Override
		public void carryingGoods() {
			System.out.println("Mercedes bring Van service commercially");
			
		}
		@Override
		public void rent() {
			System.out.println("Mercedes bring taxi car service for VIA and rent is not so high");
			
		}
		@Override
		public void smoothness() {
			System.out.println("Jaguar drive very smooth");
			
		}




}
