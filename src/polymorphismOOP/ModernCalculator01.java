package polymorphismOOP;

public class ModernCalculator01 extends LandCalculator01{
	   //Method overriding(same method name, same parameter but different syntax or logic)
		//Late binding or dynamic binding or runtime polymorphism
		@Override
		public int areaOfLand(int a,int b) {
			int total=a+b+5;
			System.out.println("AreaOfland : "+total);
			return total;
			}
		@Override
		public int areaOfLand(int a,String b) {
			int total=a+(Integer.parseInt(b))+10;
			System.out.println("AreaOfLand : "+total);
			return total;
			}
		@Override
		public int areaOfLand(int a,int b,String c) {
			int total=a+b+(Integer.parseInt(c))+25;
			System.out.println("AreaOfland : "+total);
			return total;
			}
		@Override
		public int areaOfLand(int a,int b,int d) {
			int total=a+b+d+75;
			System.out.println("AreaOfland : "+total);
			return total;
			}
		////Final method can not be overridden(Because final method can not be changed)
//		@Override
//		public final int areaOfLand(int a,int b,int c,int d) {
//			int total=a+b+c+d+22;
//			System.out.println("AreaOfland : "+total);
//			return total;
//			}
		
		//Static method can not be overridden(Because static method is a common method in parent class)
//		@Override
//		public static  int areaOfLand(int a,int b,int c,int d,int e) {
//		int total=a+b+c+d+e;
			
//			System.out.println("AreaOfland : "+total);
//			return total;
//			}

		}

