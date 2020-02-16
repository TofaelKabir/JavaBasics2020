package encapsulationOOP;

public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("Tangina");
		st1.setId(2341);
		System.out.println("My name is: "+st1.getName()+" and my ID: "+st1.getId());
		
		Student st2 = new Student();
		st2.setName("Tania");
		st2.setId(2351);
		System.out.println("My name is: "+st2.getName()+" and my ID: "+st2.getId());

	}

}
