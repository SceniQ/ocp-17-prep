package packagesimports;

import java.util.Random; // imports Random object classes
import java.util.*; // imports all classes under the java.util package
import java.nio.file.*;
//import java.nio.*; 			// NO GOOD -a wildcard only matches class names, not "file.Files"
//import java.nio.*.*; 			// NO GOOD -you can only have one wildcard and it must be at the end
//import java.nio.file.Paths.*; // NO GOOD -you cannot import methods only class names

public class NumberPicker {
	
	public static void main(String[] args) {
		// DOES NOT COMPILE WITHOUT THE RANDOM OBJECT IMPORT STATEMENT - A statement is an instruction, 
		// and import statements tell Java which packages to look in for classes
		Random r = new Random(); 
		System.out.println(r.nextInt(10)); //prints a random number between 0 and 9
	}
}

// For this example, Files and Paths are both in the package java.nio.file
class InputImports {
	
	public void read(Files files) {
		Paths.get("name");
	}
}

class Conflicts {
	
	Date date;
	// some more code
}