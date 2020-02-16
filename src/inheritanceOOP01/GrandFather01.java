package inheritanceOOP01;

public class GrandFather01 {
	
	public String Name;
	public int age;
	public char hairColor;
	public boolean usCitizen;
	
	public final String familyName = "Syed";
	
	public GrandFather01() {
		System.out.println("Default from Grandfather");
	}
	
	public GrandFather01(String name, int age, char hairColor, boolean usCitizen) {
		this.Name = name;
		this.age = age;
		this.hairColor = hairColor;
		this.usCitizen = usCitizen;
		System.out.println("My info: "+ name +"  "+ age + "   "+ hairColor + "  "+ usCitizen);
	}
	
	public void grandFatherInfo() {
		System.out.println("GrandFather: Abdul Awal");
	}
	public void property() {
		System.out.println("My property will be distributed among my child");
	}


}
