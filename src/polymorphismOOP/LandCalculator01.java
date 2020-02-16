package polymorphismOOP;

public class LandCalculator01 {
	    //Method overloading(same method name but different type of parameter)
		//Early binding or static binding or compile time polymorphism.
		public int areaOfLand(int a,int b) {
			int total=a+b;
			System.out.println("AreaOfland : "+total);
			return total;
			}
		public int areaOfLand(int a,String b) {
			int total=a+(Integer.parseInt(b));
			System.out.println("AreaOfLand : "+total);
			return total;
			}
		public int areaOfLand(int a,int b,String c) {
			int total=a+b+(Integer.parseInt(c));
			System.out.println("AreaOfland : "+total);
			return total;
			}
		public int areaOfLand(int a,int b,int d) {
			int total=a+b+d;
			System.out.println("AreaOfland : "+total);
			return total;
			}
		//Final method can be overloaded
		public final int areaOfLand(int a,int b,int c,int d) {
			int total=a+b+c+d;
			System.out.println("AreaOfland : "+total);
			return total;
			}
		//Static method can be overloaded
		public static  int areaOfLand(int a,int b,int c,int d,int e) {
			int total=a+b+c+d+e;
			System.out.println("AreaOfland : "+total);
			return total;
			}
}
