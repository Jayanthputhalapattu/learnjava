interface writer {
	public void write() ;
		
	
}
class pen implements writer{
	public void write() {
		System.out.println("im a pen");
}
}
class pencil implements writer{
		public void write() {
			System.out.println("I m a pencil");
		}
}
class kit {
	public void doSomething(writer p) {
		p.write();
	}
}

public class methodhaveobjects {
public static void main(String args[]) {
	kit k = new kit();
	writer pi = new pen();
	writer pc = new pencil();
	k.doSomething(pc);
	k.doSomething(pi);
}
}
