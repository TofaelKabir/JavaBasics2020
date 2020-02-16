package polymorphismOOP;

public class TestCalculator01 {
	public static void main(String[] args) {
		LandCalculator01 lc = new LandCalculator01();
		lc.areaOfLand(200,100);
		lc.areaOfLand(200,"75");
		lc.areaOfLand(200, 100, "50");
		lc.areaOfLand(200, 100, 40);
		lc.areaOfLand(200, 100, 20,70);
		LandCalculator01.areaOfLand(200, 100, 50, 20, 10); //static method can be directly called by class itself
		
		ModernCalculator01 mc = new ModernCalculator01();
		mc.areaOfLand(200, 100);
		mc.areaOfLand(200, "75");
		mc.areaOfLand(200, 100, "50");
		mc.areaOfLand(200, 100, 40);
		}

}
