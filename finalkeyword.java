class abc{
 final double PI;
   double  area ;
	public abc() {
		PI = 22/7;	
	}
	public double area(double r) {
		area =(r*r*PI);
		return area;
	}
	
}
public class finalkeyword {
public static void main(String args[]) {
	abc obj = new abc();
	System.out.println(obj.area(6.6));
}
}
