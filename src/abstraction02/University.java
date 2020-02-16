package abstraction02;

public interface University {
	
	//int numberOfUnivrsity=4;
	
	public void classSize();
	public void field();
	public void teacher();
	
	public default void auditorium() {
		System.out.println("All of you must have auditorium, capacity of 500 students");
	}
	public static void teacherStudentConferenceRoom() {
		System.out.println("Techer Student conference room is a must criteria");
	}

}
