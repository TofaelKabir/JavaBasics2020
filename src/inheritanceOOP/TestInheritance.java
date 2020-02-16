package inheritanceOOP;

public class TestInheritance {

	public static void main(String[] args) {
		Grandfather gf1 = new Grandfather();
		gf1.grandfatherInfo();
		gf1.eyeColor();
		
		Grandfather gf2 = new Grandfather(85, "White", true);
		//gf2.grandfatherInfo();
		//gf2.eyeColor();
		
		Father fa = new Father();
		fa.fatherInfo();
		fa.grandfatherInfo();
		fa.eyeColor();
		
		Uncle un = new Uncle();
		un.uncleInfo();
		un.grandfatherInfo();
		un.eyeColor();
		
		Aunt au = new Aunt();
		au.auntInfo();
		au.grandfatherInfo();
		au.eyeColor();
		
		Me me = new Me();
		me.myInfo();
		me.fatherInfo();
		me.grandfatherInfo();
		me.eyeColor();
		
		Son so = new Son();
		so.son();
		so.myInfo();
		so.fatherInfo();
		so.grandfatherInfo();
		so.eyeColor();
		
		Sister si = new Sister();
		si.sisterInfo();
		si.fatherInfo();
		si.grandfatherInfo();
		si.eyeColor();
		
		
		Cousin co = new Cousin();
		co.cousinInfo();
		co.uncleInfo();
		co.grandfatherInfo();
		co.eyeColor();
	}
}
//Grandfather Class = Super Class
//Father Class, Uncle Class, Aunt Class, Me Class, Son Class = sub Class

// Father extends Grandfather, Uncle extends Grandfather, Aunt extends Grandfather = Hierarchical Inheritance

// Father extends Grandfather = Single Inheritance

// Son Extends Me extends Father extends Grandfather = Multilevel Inheritance

