//Creating an interface of food which has a Teller method

interface food{
	void Teller();
}

//create a class cake which implements food ,Runnable
//so that cake is also now a food,which accepts multiThreading 
class cake implements food,Runnable{
//we should define a method which is declared in food interface (By default)
	public void Teller() {
		System.out.println("Its cake");
	}
  
	//This method is made run delayed by .5 sec intentionally,such that to 
  //see the multi_Tasking 
  
	public void run() {
		for (int i = 0;i<=5;i++) {
			System.out.println("This is runner-cake");
 //Always Thread.sleep() is excepts a error,so Try-catch is used
			try {Thread.sleep(500);}catch(Exception e){}
}
	}
}

//similarly pizza class is created which implements Runnable-FunctionalInterface,Food -interface

class pizza implements food,Runnable{
	public void Teller() {
		System.out.println("Its pizza ");
	}
	public void run() {
		for (int i = 0;i<=5;i++) {
			System.out.println("This is runner-pizza");
		}
		
	}
}
public class ThreadClass {
  public static void main(String args[]) {
  //create objects of food items
  
	 cake obj1 = new cake();
	 pizza obj2 = new pizza();
   
	 //Now we need to pass the object of Food items to thread
   
   
	 Thread t1 = new Thread(obj1);
	 Thread t2 = new Thread(obj2);
	//Firstly cake food is called,but due to multiThreading .parallelly pizza food also executes along with it 
	t1.start();
	t2.start();
  }
}
