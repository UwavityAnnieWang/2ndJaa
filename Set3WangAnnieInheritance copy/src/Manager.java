
public class Manager extends Employee {
	public String department=" ";
	public Manager(String name, int salary, String depart ) {
		super(name, salary);
		department=depart;
	}
	public String toString() {
		return (super.toString()) + " Department: " + department;
	}
	
}
