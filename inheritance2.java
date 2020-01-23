//while working with the methods,child class method always over-rides the parent class
//In order to get the method of parent class SUPER method is used.
//Super method is used to get the super-class methods
//to call a method of super-class in sub-class we use super.methodOfSuperClass();

class father{
	int num= 9;
	public String m1() {
		return"father m1";
	}
	public String m2() {
		return "father m2";
	}
	
}
class children extends father{

	public String m1() {
		return"children m1";
	}
	public String m2() {
		return "children m2";
	}
  
  
  //here in display method we need to get the m1 method which is of superclass
 // so super.m1() is used in order to get the super class;

  
	public void display() {
		System.out.println("hey ,this is in "+ super.m1());
	}
}
public class inherican {
public static void main(String args[]) {
	children obj = new children();
	obj.display();
}
}
