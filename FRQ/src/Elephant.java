
public class Elephant extends Herbivore {
	private double tuskLength;
public Elephant(String name, double length) {
	super(name);
	tuskLength = length;
	super.setSpecies("elephant");
}
public String toString() {
	return super.toString()+" with tusks " + tuskLength + " meters long";
}

}
