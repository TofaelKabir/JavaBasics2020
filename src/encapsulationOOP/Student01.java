package encapsulationOOP; //data hiding, when variable is private

public class Student01 {
	
	private String Name;
	private int id;
	private char grade;
	private boolean weeklyStudent;
	
	
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public boolean isWeeklyStudent() {
		return weeklyStudent;
	}
	public void setWeeklyStudent(boolean weeklyStudent) {
		this.weeklyStudent = weeklyStudent;
	}
	
	
	

}

//access modifier: public, private, default and protected 