class bike{
	public final void specs() {
		System.out.println("It has horn,it has lights,indicators");
	}
}
class car extends bike{
	public void specs() {
		System.out.println("It has A/c, steering ");
	}
}
public class finalmethod {
public static void main(String args[])
 {
   bike obj = new car();
   
	obj.specs();
 }
}
