public class Animal{
	
	//class variable of type String
	String name;
	
	//This one has a special return type called void. The void keyword means that no value at all
	//is returned. This method requires that information be supplied to it from the calling method;
	//this information is called a parameter. The setName() method has one parameter named
	//newName, and it is of type String. This means the caller should pass in one String parameter
	//and expect nothing to be returned.
	public void setName(String newName){
		name = newName;
	}
	
	//A method is an operation that can be called. Again,
	//public is used to signify that this method may be called from other classes. Next comes
	//the return type—in
	//this case, the method returns a String
	public String getName(){
		return name;
	}
	
	//final - optional keyword on main method signature
	public final static void main(final String... args){
		System.out.println("Hello Animal: "+args[0]);
	}
}