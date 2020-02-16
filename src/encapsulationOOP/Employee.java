package encapsulationOOP;

public class Employee {
	
	private String Name; //when variables are private
	private int empID;
	private char sex;
	private boolean fullTimeEmp;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isFullTimeEmp() {
		return fullTimeEmp;
	}
	public void setFullTimeEmp(boolean fullTimeEmp) {
		this.fullTimeEmp = fullTimeEmp;
	}
	

}
