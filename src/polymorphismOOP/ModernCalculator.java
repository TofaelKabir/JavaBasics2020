package polymorphismOOP;

public class ModernCalculator extends LandCalculator{
	@Override  //method 3
	   //summary: same method, same signature but Overriding the logic of the method
		public int areaOfLand(int a, int b, String landName) {
			   int value = Integer.parseInt(landName);
			   int total = a+b+value-5; //not working, ask why?
			   return total;
			   }
	
//		@Override  //method 1
//		public int areaOfLand(int a, int b, int c) {
//			   int total = a+b+c+3;
//			   return total;
//			   }
		@Override  //method 2
		public int areaOfLand(int b, int a) {
			   int total = b+a-4;
			   return total;
			   }
		//@Override  //Final type Method (4) declared **********
		   //public final int areaOfLand(int a, int b, int c, int d) { //Cannot override the final method from LandCalculator
			   //int total = a+b+c+d;
			  // return total;
			  // }
		   //@Override  //Static type Method (5) declared **********
		public static int areaOfLand(int a, int b, int c, int d, int e) { //The method areaOfLand of type ModernCalculator must override or implement a supertype method, not a static method
			   int total = a+b+c+d+e-7;                                   //So, static method can't be override, if we remove @override it will work as static method of this class
			   return total;
			   }
		   

}
