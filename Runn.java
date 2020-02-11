package test;

public class Ruunner {
    public static void main(String args[]) {
    	LinkedList l = new LinkedList();
    	l.insert(40);
    	l.insert(25);
    	l.insert(400);
    	
    	l.insertAt(2, 15);
    	
    	
    	l.deleteAt(3);
    	l.display();
    }
}
