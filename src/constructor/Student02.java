package constructor;

public class Student02 {
	
	
	public String Name; //global variable //class variable
	public int id;
	public char grade;
	public boolean usCitizen;
	//constrauctor1
	public Student02() { //default constructor //you can't write a parameterized constructor without a default constructor
		System.out.println("This is from default constructor"); 
	}
	//constructor2
	public Student02(String Name, int id) { //parameterized constructor declared //String Name, int id is called local variable 
		this.Name = Name; //this keyword
		this.id = id;
		System.out.println("Student is: "+Name+ " and his ID is: "+id); 
	}
	//constructor3
	public Student02(String Name, int id, char grade, boolean usCitizen) { //parameterized constructor  //local variable
		this.Name = Name;
		this.id = id;
		this.grade = grade;
		this.usCitizen = usCitizen;
		System.out.println("Student is: "+Name+ ", his/her ID is: "+id+ ", his/her grade: "+grade+ ", US Citizen: "+usCitizen); 
	}
	public void schoolName() {
		System.out.println("We are from CUNY");
	}
	public static void main(String[] args) {
		Student02 st1 = new Student02(); //initialization of default constructor or constructor1
		st1.schoolName();
		Student02 st2 = new Student02("Shohan", 007, 'A', true); //"Shohan", 007, A, TRUE --- they are called argument// constructor 3 is initialize
		Student02 st3 = new Student02("Tofael", 8); //initialization of constructor2
		Student02 st4 = new Student02("Dalia", 9, 'A', true);//initialization of constructor3
		}
		}


