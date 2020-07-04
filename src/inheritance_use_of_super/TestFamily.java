package inheritance_use_of_super;

public class TestFamily {

	public static void main(String[] args) {
		Father father = new Father();
		System.out.println("---------------------------------------------------------------");
		father.fatherInfo();
		System.out.println("---------------------------------------------------------------");
		Father father2 = new Father(456, "fd", false);
		System.out.println("---------------------------------------------------------------");
		father2.father(98, "434", true);
		System.out.println("---------------------------------------------------------------");
		Grandfather grandfather = new Grandfather();
		System.out.println("---------------------------------------------------------------");
		grandfather.grandfatherInfo(123, "red", false);
		System.out.println("---------------------------------------------------------------");

	}

}
