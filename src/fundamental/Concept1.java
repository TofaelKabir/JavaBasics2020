package fundamental;

import java.sql.Wrapper;

public class Concept1 {

	public static void main(String[] args) {

		// how to turn String into Integer

		String stName1 = "100";
		System.out.println(stName1);
		System.out.println(stName1 + 20);
		System.out.println(stName1 + "   " + 20);

		int stId1 = Integer.parseInt(stName1); // how to turn String to integer

		System.out.println(stId1 + 20);
		System.out.println(stId1 + " " + 20);

		// conversion from String to integer (when not a pure number)
		// interview question
		String stName2 = "100W";
		System.out.println(stName2);
		System.out.println(stName2 + 20);
		System.out.println(stName2 + "  " + 20);

		// int stId2 = Integer.parseInt(stName2); //how to turn String to integer

		// why it's not possible below?
		// System.out.println(stId2+20); //because parseInt method can't convert non
		// pure integer to String,
		// System.out.println(stId2+" "+20); //Thus show run time error , but not
		// compilation error

		// conversion from String to double

		String stFullName = "3.15";
		System.out.println(stFullName);
		System.out.println(stFullName + 1.25);
		System.out.println(stFullName + "  " + 1.25);

		double stGrade = Double.parseDouble(stFullName); // you have to memorize it
		System.out.println(stGrade);
		System.out.println(stGrade + 1.25);

		// conversion from String to character (is not possible, because no method
		// created for that)
		// there is no method name parserCharacter, because String is a collection of
		// Character
		// rather we find a method

		char sex = Character.toUpperCase('m');
		System.out.println(sex);

		// conversion from String to boolean

		String employee1 = "true";
		System.out.println(employee1);
		System.out.println(employee1 + "  " + 20);
		boolean male = Boolean.parseBoolean(employee1);
		System.out.println(male);

		// conversion from String to boolean by default (by default boolean is false)

		String employee2 = " ";
		System.out.println(employee2); // what will print?
		System.out.println(employee2 + "  " + 20);
		boolean usCitizen = Boolean.parseBoolean(employee2);

		System.out.println(usCitizen);

		// conversion from integer to String

		int empId = 2188458;
		System.out.println(empId);
		System.out.println(empId + 251);
		System.out.println(empId + "  " + 251);
		String empName = String.valueOf(empId);
		System.out.println(empName);
		System.out.println(empName + 20); // explain why?
		//https://www.developer.com/java/data/understanding-java-wrapper-classes.html
		
		

	}
	//I just bring changes here.jhdsjhdjsdjhcjsdjcvjdsvcjdvscvjdsvc
}
