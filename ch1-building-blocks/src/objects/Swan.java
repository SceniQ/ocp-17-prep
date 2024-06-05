package objects;

/*
 * Reading and Writing Member Fields
 * 
*/
public class Swan {
	int numberEggs; // instance variable

	public static void main(String[] args) {
		Swan mother = new Swan();
		mother.numberEggs = 1; // set variable
		System.out.println(mother.numberEggs); // read variable
	}
}

//You can even read values of already initialized fields on a line initializing a new field:
class Name {
 String first = "Theodore";
 String last = "Moose";
 String full = first + last;
}