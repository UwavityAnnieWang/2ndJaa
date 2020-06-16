/**
 * Started 2/3/20
 * @author Annie Wang
 *
 */
public class Employee {
	//instance variables 
	private int salary;
	private String name;
	//constructors 
	public Employee() {
		this.salary=0;
		this.name=" ";
	}
	public Employee(String moniker, int paid) {
		name = moniker;
		salary=paid; 
	}
	
	//toString 
	public String toString() {
		return "Name: " + name + " Salary: " + salary;
	}
	

}
