
public class Herbivore extends Animal{
	
	public Herbivore(String species, String name) {
		super(species, name);
		
		super.setType("herbivore");
	}
	public Herbivore(String name) {
		super(name);
		super.setType("herbivore");
		
	}
	
	public String toString() {
		return super.toString();
	}
	
}
