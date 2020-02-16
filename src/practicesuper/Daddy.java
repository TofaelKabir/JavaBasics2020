package practicesuper;

public class Daddy {

	public int age;
	public String first_name;
	public String family_name="khan";

	
	public Daddy() {
		System.out.println("This is a default constructor");

	}

	public Daddy(int age, String first_name) {
		this.age = age;
		
		this.first_name = first_name;

		System.out.println("He is my daddy. His age: " + age + ". His family name is " + first_name);

	}
	public void eye()
	{
		System.out.println("My dod eye's are brown");
	}
}
