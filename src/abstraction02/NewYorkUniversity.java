package abstraction02;

public class NewYorkUniversity extends MedicalSchool implements Hospital,University {

	
	public void bed() {
		System.out.println("We have a hospital which has 400 bed for the public");
	}
	public void classSize() {
        System.out.println("Teacher student ratio is 1:40");
	}
    public void field() {
		System.out.println("We have indoor soccer field because we are in NY");
	}
    public void teacher() {
		System.out.println("Our teachers are best in NY, coming from reknown university althrough world");
	}
	public void anatomyLab() {
		System.out.println("We recently created an anatomy lab");
	}
	
}
