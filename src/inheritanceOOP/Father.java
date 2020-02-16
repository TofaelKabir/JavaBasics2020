package inheritanceOOP;

public class Father extends Grandfather {
	public Father(){
		//super();//when we use super key word, it can call the default constructor of super class
		//it can execute only one constructor, either default or parameterized
		super(65, "Grey", true);
		super.eyeColor(); //super key word can call the method of the super class
		System.out.println("Family Name: "+super.FamilyName); //it can call 
		System.out.println("this is the default constructor from father");	
		//super(); //why can't use after sysout, see next line
		//Constructor call must be the first statement in a constructor, super keyword always use before System.out.println
	}
	
	public void fatherInfo() {
		System.out.println("My name is Haque and I have 2 sons and 3 daughters");
	}
}
