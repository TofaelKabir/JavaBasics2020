package polymorphismOOP;

public class LandCalculator { //Method overloading
	   //String landName, no need to declare or initialize
	   
		//Return type Method (1) declared
		public int areaOfLand(int a, int b, int c) { //if you write like (int c, int b, int a), it will not work
		   int total = a+b+c;  //(int b, int a) works
		   return total;
		   }
	   //Return type Method (2) declared
	   public int areaOfLand(int b, int a) { //summary: same method name but different signature, in different orientation is ok
		   int total = b+a;
		   return total;
		   }
	   //Return type Method (3) declared but one of the signature is String type
	   public int areaOfLand(int a, int b, String landName) {
		   int value = Integer.parseInt(landName);
		   int total = a+b+value; //need to know how?
		   return total;
		   }
	   //Final type Method (4) declared **********
	   public final int areaOfLand(int a, int b, int c, int d) {
		   int total = a+b+c+d;
		   return total;
		   }
	   //Static type Method (5) declared **********
	   public static int areaOfLand(int a, int b, int c, int d, int e) {
		   int total = a+b+c+d+e;
		   return total;
		   }
	}
