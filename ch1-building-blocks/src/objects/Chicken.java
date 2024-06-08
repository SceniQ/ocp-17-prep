package objects;

public class Chicken {
	
	//{ System.out.println(name); } // DOES NOT COMPILE - illegal forward reference
	
	private String name = "Fluffy";
	{ System.out.println("setting field"); }
	
	public Chicken() {
		name = "Tiny";
		System.out.println("setting constructor");
	}
	
	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		System.out.println(chicken.name);
		String test = "test1";
		testingString(test);
		
	}

	private static void testString(String testingString){
		testingString = "test2";
		System.out.println(testingString);
	}
 
 }

// Order of execution 
class Egg {
	public Egg() {
		number = 5;
	}

	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
	}
	
	private int number = 3;
	{ number = 4; } 
	
}