package practice2;

public class Car { //opening of claass body

//class body	
//variable declared or initialize
//constructor declared
//method declared or implemented
	
	 public String Brand = "Acura"; //String always in caps lock: Brand and double quotation is used
	 int mileage = 23415;    //except String every variable is in small letter, int represent number
	 char grade = 'A';       //char always in a single character and surrounded by single quotation
	 boolean electrical = false;   //true or false, (by default false)
	
	 public void carInfo(){ //method implemented
			//void type method or non return method or non static method, simplest presentation of method
			//method name always in small letter	
			//after method name there is ()
			System.out.println("My car is: " + Brand + " And the mileage is: " + 
			mileage + ", It's an '" +grade+ "' grade car. " + " Is it an electric car? Ans: "+electrical ); //concatenation - joining of 2 or 3
			
			}
	
	
	public static void main(String[] args) {
		Car car = new Car();
		car.carInfo();
		
		

	}
	

	
	
	
	
	

}//closing of class body
