/**
 * 
 * @author Annie Wang 
 *
 */
public class EmployeeInheritanceTester {
	//tests employee, manager and executive classes 

	public static void main(String[] args) {
	Employee chad = new Employee("Chad", 100);
	Manager steve = new Manager("Steve", 2000, "idk mans");
	Executive putin = new Executive("Putin", 20000, "who knows", "Grand supreme leader stalin chan");
	System.out.println(chad);
	System.out.println(steve);
	System.out.println(putin);
	

	}

}
