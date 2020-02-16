package abstraction02;

public abstract class MedicalSchool implements Hospital {
	public int medicalNumber;
	public MedicalSchool() {
		System.out.println("default constructor");
	}
	public MedicalSchool(int medicalNumber) {
		this.medicalNumber = medicalNumber;
		
	}
	public abstract void anatomyLab();
	public void bioChemistryLab() {
		System.out.println("Biochemistry lab is extremely equiped");
	}

}
