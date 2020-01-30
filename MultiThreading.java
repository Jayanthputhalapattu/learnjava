/*
This is a program which prints "Hi" and "Hello" ; To print it takes some time to print the other 
so we can run two tasks in paralle using THREAD (Thread) concept in java.




*/

//package for scanner class to declare its object
import java.util.*;

//A class which extends Thread ,has method run (run is a in-built method) to print "Hi";

class toSayHi extends Thread{
   int numb;
   public void getter(int numb) {
		this.numb = numb;
	}
	public void run() {
		
		for (int i =1;i<=numb;i++) {
			System.out.println("Hi");
			try {Thread.sleep(500);}catch(Exception e) {}
	}
		
	}
	
}
//another class which extends Thread class and prints "hello"
class toSayHello extends Thread{
	int numb;
	 public void getter(int numb) {
			this.numb = numb;
		}
public void run() {
		
		
		for (int i =1;i<=numb;i++) {
			System.out.println("Hello");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
public class threadJAVA {
  public static void main(String args[]) throws Exception {
	  System.out.println("Enter a number : ");
	  Scanner sc = new Scanner(System.in);
	  int num = sc.nextInt();
	  sc.close();
	  
	  
	  toSayHi obj1 = new toSayHi();
	  toSayHello obj2 = new toSayHello();
	  
	  obj1.getter(num);
	  obj2.getter(num);
    //start is a in-built method which calls run method;
	  obj1.start();
    //Time-delay to make sure we set the preference for which we need to print first.
	  Thread.sleep(10);
	  obj2.start();
	  
	
  }
}

