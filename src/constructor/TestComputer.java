package constructor;

public class TestComputer {
	public static void main(String[] args) {
		   Computer comp1 = new Computer(); //default constructor initialize	
	       comp1.brandAndModel = "Apple, MacBookAir";
	       comp1.operatingSystem = "macOS Mojave";
	       comp1.price = 1300;
	       comp1.category = 'A';
	       comp1.category = 'B';
	       comp1.madeInUsa = false;
	       //comp1.aboutComputer();
	       
	       comp1.computerConfiguration();
	       comp1.setReveiwNumber(9);
	       System.out.println("My computer review is: "+comp1.getReveiwNumber()+" in 10.");
	       
	       Computer comp2 = new Computer("Dell, inspiron15"); //constructor 2 initialize
		   Computer comp3 = new Computer("HP Pavilion, X360", "Windows", 489, 'B'); //constructor 3 initialize
		   Computer comp4 = new Computer("Apple, MacBook Pro","MacOS", 1799, 'A' ); //constructor 3 initialize
		   comp4.setReveiwNumber(10);
		   System.out.println("someone's computer review is: "+comp4.getReveiwNumber()+" in 10.");
		   System.out.println("My computer review is: "+comp1.getReveiwNumber()+" in 10.");
		   
		   //comp2.aboutComputer(); //why?
		   System.out.println(Computer.reveiwNumber = 5);
		   
		   Computer.aboutComputer();
		   //comp3.aboutComputer();
		}

	}

