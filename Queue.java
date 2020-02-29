package test;

public class Queue {
  int front,rear;
  int size;
  int queue[] = new int[5];
  
  public void enque(int data) {
	  if (size==5) {
	  System.out.println("Queue is full");
  }
	  else {
		  queue[rear] = data;
			rear = (rear+1)%5;
			size++;
	  }
  }
  public int Dequeue() {
	  int data = queue[front];
	  if (!isEmpty()) {
		  
	       front = (front+1)%5;
	       size = size -1;
	      
	  }
	  else
		  System.out.println("Queue is empty");
	  return data;
  }
  public void show() {
	  for (int i =0;i<size;i++) {
		  System.out.println(queue[(i+front)%5]);
	  }
	  System.out.println();
	  for (int i : queue) {
		  System.out.println(i);
	  }
  }
  
  public int size() {
	 return size;
  }
  
  public boolean isEmpty() {
	  return (size()==0);
  }
  
}
