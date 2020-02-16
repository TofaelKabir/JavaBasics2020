package encapsulationOOP;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Tanzina Khan");
		emp1.setEmpID(21234);
		emp1.setSex('F');
		emp1.setFullTimeEmp(true);
		System.out.println("Employee name: "+emp1.getName()+", ID: "+emp1.getEmpID()+
				", Sex: "+emp1.getSex()+", full time employee: "+emp1.isFullTimeEmp());
		
		Employee emp2 = new Employee();
		emp2.setName("Ruslan");
		emp2.setEmpID(21294);
		emp2.setSex('M');
		emp2.setFullTimeEmp(false);
		System.out.println("Employee name: "+emp2.getName()+", ID: "+emp2.getEmpID()+
				", Sex: "+emp2.getSex()+", full time employee: "+emp2.isFullTimeEmp());

	}

}
