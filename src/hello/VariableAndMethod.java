package hello;

//we can also write the class name like Variable_and_method
public class VariableAndMethod { // opening of class body

	// class body
	// class body contain-
	// variable - declared or initialize
	// constructor - declared or initialize
	// method - implemented or initialize

	public String Name; // variable declared //String type always in Capslock
	public int id; // int, char, boolean, float, double - all are in small lettter
	public char sex;
	public boolean usCitizen;

	// we have few more, we will learn later
	public void studentInfo() { // method implemented
		System.out.println(
				"Student name: " + Name + ", His ID: " + id + ", His Sex: " + sex + ", US Citizen: " + usCitizen);
	}

	public static void main(String[] args) {
		VariableAndMethod vm = new VariableAndMethod(); // The class is instantiated (examplify) //vam is called
														// reference variable// it is also object
		vm.Name = "Tofael"; // variable initialized //String always inside double quotation
		vm.id = 21768;
		vm.sex = 'F'; // Inside single quotation
		vm.usCitizen = true;
		vm.studentInfo();

	}// closing of class body

}
