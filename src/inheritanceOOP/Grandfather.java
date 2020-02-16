package inheritanceOOP;

public class Grandfather {
	int age;
	String HairColor;
	boolean usCitizen;
	String FamilyName = "Bhuiyan";
	
	public Grandfather()
	{
		System.out.println("This is the default constructor from grandfather");
	}
	
	public Grandfather(int age, String hairColor, boolean usCitizen) {
		this.age = age;
		this.HairColor = hairColor;
		this.usCitizen = usCitizen;
		System.out.println("My Age: "+age+", Hair Color: "+hairColor+" and I am USCitizen: "+usCitizen );
		
	}

	public void grandfatherInfo() {

		System.out.println("My name is Seraj and I have 2 sons and 1 daughter and my familyName is: "+FamilyName);

	}
	public void eyeColor(){
		System.out.println("Eye Color Brown");
		
	}
}
