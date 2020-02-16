package inheritanceOOP01;
//Test Family Class
public class FamilyHierarchy {

	public static void main(String[] args) {
		GrandFather01 gf = new GrandFather01();
		//gf.grandFatherInfo();
		
		GrandFather01 gf2 = new GrandFather01("Mohammad", 78, 'W', false);
		
		
		Father01 fa = new Father01();
		fa.fatherInfo();
		fa.grandFatherInfo();
		
		Uncle01 un = new Uncle01();
		un.uncleInfo();
		un.grandFatherInfo();
		
		Aunt01 au = new Aunt01();
		au.auntInfo();
		au.grandFatherInfo();
		
		Son01 sn = new Son01();
		sn.sonInfo();
		sn.fatherInfo();
		sn.grandFatherInfo();
		
		Cousin01 co = new Cousin01();
		co.cousinInfo();
		co.uncleInfo();
		co.grandFatherInfo();
		
		GrandSon01 gs = new GrandSon01();
		gs.grandSonInfo();
		gs.sonInfo();
		gs.fatherInfo();
		gs.grandFatherInfo();
		
		GrandDaughter01 gd = new GrandDaughter01();
		gd.grandDaughterInfo();
		gd.sonInfo();
		gd.fatherInfo();
		gd.grandFatherInfo();
		
	}

}
/* 
 1. GrandFather = Super Class or parent class and rest of the classes are sub class or child class
 2. Father extends Grandfather, Uncle extends Grandfather, Aunt extends Grandfather - they are called 'Hierarchical' inheritance
 3. Son extends Father,  - this is called 'Single' inheritance
 4. GrandSon Extends son, Son extends father, Father extends GrandFather - they are called ' Multilevel inheritance
 
 
 */








