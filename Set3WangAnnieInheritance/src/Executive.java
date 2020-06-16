/**
 * 
 * @author Annie Wang 
 *
 */
public class Executive extends Manager {
	//instance variable 
	public String title=" ";
//constructor 
	public Executive(String name, int salary, String depart, String e) {
		super(name, salary, depart);
		title=e;
		// TODO Auto-generated constructor stub
	}
	//toString 
	public String toString() {
		return (super.toString()) + " Title: " + title;
	}
	

}
