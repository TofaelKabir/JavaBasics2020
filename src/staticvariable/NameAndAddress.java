package staticvariable;

public class NameAndAddress {

	String fullName = "Mohammad Tofael Kabir Sharkar";
	int houseNumber = 625;
	char direction = 'W';
	int aptNumber = 2952;
	int stNumber = 57;
	String state = "NY";
	int zipCode = 10019;
	
public void nameAndAddress() {
	System.out.println(fullName+houseNumber+direction+ " "+stNumber+"st, Apt "+aptNumber+", "+state+ " "+zipCode);
    }

public static void main(String[] args) {
    NameAndAddress nd = new NameAndAddress();
	nd.nameAndAddress();
    }
}