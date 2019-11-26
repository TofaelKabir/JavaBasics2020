package constructor;


	public class Student {
		public static int classRoomSize;

		public void setClassRoomSize(int classRoomSize) {
			Student.classRoomSize = classRoomSize;
		}
		public int getClassRoomSize() {
			return classRoomSize;
		}
	    public static void SharingClass() {
	    	System.out.println("Let's share our space");
	    }
	}

