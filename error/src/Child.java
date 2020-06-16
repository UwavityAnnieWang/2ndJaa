import java.util.ArrayList;

public class Child extends Parent {String something = "hello";
	/**private int value;
	   public Child(int number){
	      value = number;
	   }
	   public void doSomething(int n) {   // method 2
       System.out.println("method 2");}

  public void doSomething()     {    // method 3
        System.out.println("method 3");}

	   public static void main(String[]args) {**/
	public void doSomething(int n) {   // method 2
    System.out.println("method 2");
    
    
    }

public void doSomething()  {       // method 3
     System.out.println("method 3");
}  
public static void main(String[]args) {
	Parent kid = new Child();
	kid.doSomething();
	String[]why = new String[1];
    why[0]="new";
    String how = "how";
    System.out.println(how.length());
    ArrayList<String>well= new ArrayList<>();
    for(int i=0; i<why.length; i++) {
    	well.add(why[0]);
    }
    System.out.println(well);
}







}




