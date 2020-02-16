package polymorphismOOP;

public class TestCalculator {

	public static void main(String[] args) {
		LandCalculator cal = new LandCalculator(); // Best to call the method in serial 1, 2, 3, 4 .....
		System.out.println("Local Cal: "+cal.areaOfLand(10, 27, 234)); //Method 3 initialize
		System.out.println("Local Cal: "+cal.areaOfLand(27, 10)); //Method 2 initialize
        System.out.println("Local Cal: "+cal.areaOfLand(10, 27, 41)); //Method 1 initialize
        System.out.println("Local Cal: "+cal.areaOfLand(10, 27, 41, 24)); //Final Method initialize
        
        System.out.println("Local Cal: "+LandCalculator.areaOfLand(10, 27, 41, 24, 23)); //Static Method (5) initialize
	    //see carefully line number 12, used Class to call method
	    
        ModernCalculator mcal = new ModernCalculator();
	    System.out.println("Modern Cal: "+mcal.areaOfLand(10, 27, 234)); //***This is not working**following line 14 rule***but why?
	    System.out.println("Modern Cal: "+mcal.areaOfLand(27, 10));
	    System.out.println("Modern Cal: "+mcal.areaOfLand(10, 27, 41));
	    
	    System.out.println("Modern Cal: "+ModernCalculator.areaOfLand(10, 27, 41, 24, 23)); 
	
	}

}
