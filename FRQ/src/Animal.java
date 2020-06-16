
public class Animal {
	private String type, species, name;
	
	public Animal(String one, String two, String three) {
		type=one;
		species=two;
		name=three;
	}
	public Animal(String one, String two) {
		species=one;
		name=two;
	}
	public Animal(String three) {
		name=three;
	}
	
	public void setType(String one) {
		type=one;
	}
	public void setSpecies(String one) {
		species=one;
	}
	public void setName(String one) {
		name=one;
	}
	
	public String toString() {
		return name + " the " + species + " is a " + type; 
	}
	

}
