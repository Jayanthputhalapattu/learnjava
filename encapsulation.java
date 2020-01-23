class Student{
	private int rollno;
	private String name ;
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class encapsulation { 
   public static void main(String args[]) {
	   Student  s1 = new Student();
	   s1.setRollno(5);
	   s1.setName("JAYANTH");
	   System.out.println(s1.getRollno()) ;
	   System.out.println(s1.getName());
}
}
