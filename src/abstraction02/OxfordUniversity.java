package abstraction02;

public class OxfordUniversity extends MedicalSchool implements University, TechUniversity{
//where OxfordUniversity is the concrete class
	
	public void classSize() {
		System.out.println("Our class size is pretty good, ratio of teacher student is 1:30");
	}
    public void field() {
		System.out.println("We have 5 large soccer field");
	}
    public void teacher() {
		System.out.println("All of your teachers have PhD from Oxford");
	}
	public void engineeringLab() {
		System.out.println("We are providing the engineering lab for our student");
	}
	public void anatomyLab() {
		System.out.println("Anatomy lab is recently establish");
	}
	public void bed() {
		System.out.println("We created a small hospital for the students having 40 bed with an emergency facility");
	}
}
