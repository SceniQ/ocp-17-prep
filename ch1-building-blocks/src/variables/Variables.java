package variables;

public class Variables{
	
	long okidentifier;
	float $OK2Identifier;
	boolean _alsoOK1d3ntifi3r;
	char __SStillOkbutKnotsonice$;
	
	//These examples are not legal:
	//int 3DPointClass; 		// identifiers cannot begin with a number
	//byte hollywood@vine; 		// @ is not a letter, digit, $ or _
	//String *$coffee; 			// * is not a letter, digit, $ or _
	//double public; 			// public is a reserved word
	//short _; 					// a single underscore is not allowed
	
	//The final keyword can be applied to local variables and is equivalent to declaring constants
	//in other languages. Consider this example:
	final int y = 10;
	int x = 20;
	//y = x + 10; // DOES NOT COMPILE - y uses the final keyword. For this reason, line 7 triggers a compiler error since the value cannot be modified
	
	
	public static void main(String... args){
		String greet = "oldString";
		changeString(greet);
		System.out.println(greet); // output - "oldString", String value not changed by method
	}
	
	private static void changeString(String oldString){
		oldString = "newString";
	}
	
	private static int notValid() {
		int y = 10;
		int x;
		//int reply = x + y; // DOES NOT COMPILE - since we're trying to use 'x' when it is not intialized
 		//return reply;
		return y;
	}
	
	//You can also declare and initialize multiple variables in the same statement
	void sandFence() {
		String s1, s2;
		String s3 = "yes", s4 = "no";
	}
	
	//As you should expect, three variables were declared: i1, i2, and i3. However, only one
	//of those values was initialized: i3. The other two remain declared but not yet initialized.
	void paintFence() {
		int i1, i2, i3 = 0;
	}
	
	//int num, String value; // DOES NOT COMPILE - This code doesn’t compile because it tries to declare multiple variables of different types
							// in the same statement.
	
	//
	public int valid() {
		int y = 10;
		int x; // x is declared here
		x = 3; // x is initialized here
		int z; // z is declared here but never initialized or used
		int reply = x + y;
		return reply;
	}
	
	//
	public void findAnswer(boolean check) {
		int answer;
		int otherAnswer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
	
		System.out.println(answer);
		//System.out.println(onlyOneBranch); // DOES NOT COMPILE - 'onlyOneBranch' is only initialized once, this leaves it uninitialized and cannot be used
	}	
}

//You have the option of using the keyword var instead of the type when declaring local variables
//under certain conditions. To use this feature, you just type var instead of the primitive
//or reference type.
class Zoo {

	public void whatTypeAmI() {
		var name = "Hello";
		var size = 7;
	}
	
	//
	public void reassignment() {
		var number = 7;
		number = 4;
		//number = "five"; // DOES NOT COMPILE
	}
	
	public void eatIfHungry(boolean hungry) {
		if (hungry) {
			int bitesOfCheese = 1;
		{
		var teenyBit = true;
		System.out.println(bitesOfCheese);
		}
		}
		//System.out.println(teenyBit); // DOES NOT COMPILE
	}
		
}