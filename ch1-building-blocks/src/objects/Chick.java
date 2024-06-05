package objects;

/*
 * Calling Constructors
 * To create an instance of a class, all you have to do is write new before the class name and
 * add parentheses after it. Here’s an example:
 * Park p = new Park();
*/

public class Chick {
	String name;
	
	//There are two key points to note about the constructor: the name of the constructor
	//matches the name of the class, and there’s no return type.
	//For most classes, you don’t have to code a constructor—the compiler will supply a
	//do nothing default constructor for you.
	
	public Chick() {
		System.out.println("in constructor");
		name = "Duke"; // initialize in constructor
	}
	
	public void Chick() {} // NOT A CONSTRUCTOR
}