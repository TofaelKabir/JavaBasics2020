package abstraction02;

public class TestUniversity {

	public static void main(String[] args) {
		University uni = new OxfordUniversity (); //Cannot instantiate the type University because University is a interface,
        uni.classSize();   //only abstract method inside the interface which is declared
	    uni.field();
	    uni.teacher();
	    
	    uni.auditorium();
	    
	    University.teacherStudentConferenceRoom();
	    
	    OxfordUniversity of = new OxfordUniversity();
	    of.classSize();
	    of.field();
	    of.teacher();
	    of.auditorium();
	    //of.numberOfUnivrsity = 4; ask NASIR BHAI
	    
	    of.engineeringLab();
	    
	    of.anatomyLab();
	    of.bioChemistryLab();
	    of.bed();
	    
	    TechUniversity tu = new OxfordUniversity(); //Cannot instantiate the type TechUniversity
	    tu.engineeringLab();
	    
	    MedicalSchool ms = new OxfordUniversity(); //Cannot instantiate the type MedicalSchool
	    ms.anatomyLab();
	    ms.bioChemistryLab();
	    ms.bed();
	    
	    Hospital hs = new OxfordUniversity(); //cannot instantiate the type Hospital
	    hs.bed();
	    
	    NewYorkUniversity nyu = new NewYorkUniversity();
	    nyu.bed();
	    nyu.classSize();
	    nyu.field();
	    nyu.teacher();
	    nyu.auditorium();
	    nyu.anatomyLab();
	    nyu.bioChemistryLab();
	    
	   
	}

}
