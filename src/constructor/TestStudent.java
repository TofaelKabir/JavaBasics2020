package constructor;

public class TestStudent {

	public static void main(String[] args) {
		Student tofael = new Student();
		tofael.setClassRoomSize(20);
		System.out.println("Tofael need "+tofael.getClassRoomSize()+" sqft in the class romm");
        
		Student hafiz = new Student();
		hafiz.setClassRoomSize(22);
		System.out.println("Hafiz need "+hafiz.getClassRoomSize()+" sqft in the class romm");
	    
		System.out.println("Tofael need "+tofael.getClassRoomSize()+" sqft in the class romm");
	    
	    
		Student shohag = new Student();
		shohag.setClassRoomSize(35);
		System.out.println("Shohag need "+shohag.getClassRoomSize()+" sqft in the class romm");
		System.out.println("Hafiz need "+hafiz.getClassRoomSize()+" sqft in the class romm");
		System.out.println("Tofael need "+tofael.getClassRoomSize()+" sqft in the class romm");
		
		
		
		Student.SharingClass();
	    /*Student.classRoomSize =27;
	    tofael.setClassRoomSize;
	    tofael.getClassRoomSize(classRoomSize);*/
	}

}
