public class Animal{
	
	String name;
	
	public void setName(String newName){
		name = newName;
	}
	public String getName(){
		return name;
	}
	
	//final - optional keyword on main method
	public final static void main(final String... args){
		System.out.println("Hello Animal: "+args[0]);
	}
}