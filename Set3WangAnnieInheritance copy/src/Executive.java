
public class Executive extends Manager {
	public String title=" ";

	public Executive(String name, int salary, String depart, String e) {
		super(name, salary, depart);
		title=e;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return (super.toString()) + " Title: " + title;
	}
	

}
