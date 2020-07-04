package inheritance_use_of_super;

public class Father extends Grandfather {
	int aged;
	String HairColord;
	boolean usCitizend;
	
	public Father() {
		// super();//when we use super key word, it can call the default constructor of
		// super class
		// it can execute only one constructor, either default or parameterized
		super(65, "Grey", true);
		super.eyeColor(); // super key word can call the method of the super class
		super.grandfatherInfo(age, HairColor, usCitizen); // how it is possible to getting the value from line 7?
		super.FamilyName = "sdfds";
		System.out.println("Family Name: " + super.FamilyName); // it can call
		System.out.println("this is the default constructor from father");
		// super(); //why can't use after sysout, see next line
		// Constructor call must be the first statement in a constructor, super keyword
		// always use before System.out.println
	}

	public Father(int aged, String hairColord, boolean usCitizend) {
		super(67,"hjh", false);
		this.aged = aged;
		HairColord = hairColord;
		this.usCitizend = usCitizend;
		System.out.println("hdhdhdd"+aged+ hairColord+ usCitizend);
	}

	public void fatherInfo() {
		// super(65, "Grey", true); // Constructor call must be the first statement in a
		// constructor
		super.grandfatherInfo(56, "tertete", false);
		super.eyeColor();

		System.out.println("My name is Haque and I have 2 sons and 3 daughters");
	}
	public void father(int aged, String hairColord, boolean usCitizend) {
		super.grandfatherInfo(age, HairColor, usCitizen);
		super.eyeColor();
		this.aged = aged;
		HairColord = hairColord;
		this.usCitizend = usCitizend;
		
		System.out.println(aged+ hairColord+ usCitizend);
	}
}
