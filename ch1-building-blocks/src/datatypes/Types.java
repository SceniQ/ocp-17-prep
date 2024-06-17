package datatypes;

/*
	* Java applications contain two types of data: primitive types and reference types
*/

public class Types{
	
	// DOES NOT COMPILE - Java complains the number is out of range. And it is—for
	// an int. However, we don’t have an int. The solution is to add the character L to the number:
	//long max = 3123456789; 
	
	long max = 3123456789L; // Now Java knows it is a long
	
	// The last thing you need to know about numeric literals is that you can have underscores in
	// numbers to make them easier to read:
	int million1 = 1000000;
	int million2 = 1_000_000;
	
	//double notAtStart = _1000.00; 		// DOES NOT COMPILE
	//double notAtEnd = 1000.00_; 			// DOES NOT COMPILE
	//double notByDecimal = 1000_.00; 		// DOES NOT COMPILE
	double annoyingButLegal = 1_00_0.0_0; 	// Ugly, but compiles
	double reallyUgly = 1__________2; 		// Also compiles
	short __;								// Compiles
	
	//String block = """doe"""; // DOES NOT COMPILE - Text blocks require a line break after the opening """, making this one invalid.
	
	private static String textBlock = """
		"Java Study Guide" 
		by Scott & Jeanne""";
			
	private static String pyramid = """
		*
		* *
		* * *
		""";
}