package homeWork;

public class NameAndAddress02 {
	String fullName = "Mohammad Tofael Kabir Sharkar";
	int houseNumber = 625;
	char direction = 'W';
	int aptNumber = 2952;
	int stNumber = 57;
	String state = "NY";
	int zipCode = 10019;
	
public void nameAndAddress() {
	System.out.println(fullName+"\n"+houseNumber+direction+ " "+stNumber+"st, Apt "+aptNumber+", "+state+ " "+zipCode);
    }

public static void main(String[] args) {
	NameAndAddress02 nd = new NameAndAddress02();
	nd.nameAndAddress();
    }
}
