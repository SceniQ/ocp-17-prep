package objects;

public class Chicken {
	
	private String name = "Fluffy";
	{ System.out.println("setting field"); }
	
	public Chicken() {
		name = "Tiny";
		System.out.println("setting constructor");
	}
	
	public static void main(String[] args) {
		Chicken chicken = new Chicken();
		System.out.println(chicken.name); 
	} 
 
 }