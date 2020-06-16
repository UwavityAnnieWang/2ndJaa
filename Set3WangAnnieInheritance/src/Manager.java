/**
 * 
 * @author Annie Wang 
 *
 */
public class Manager extends Employee {
	//instance variable 
	public String department=" ";
	//constructor 
	public Manager(String name, int salary, String depart ) {
		super(name, salary);
		department=depart;
	}
	//toString 
	public String toString() {
		return (super.toString()) + " Department: " + department;
	}
	
}
