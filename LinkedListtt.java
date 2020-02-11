package dataStructures;

public class LinkedListtt {
	Node head ;
	public void insert(int data) {
		Node node  = new Node();
		node.data = data;
		if (head ==null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
		
	}
	public void display() {
		Node n = head ;
		while(n.next!=null) {
			System.out.println(n.data);
			n=n.next;
		}
		System.out.println(n.data);
	}
       
}

 public void insertAt(int index ,int data) {
      	Node node = new Node();
      	node.data = data;
      	node.next = null;
      	Node n = head;
      	if (index ==0) {
      		insertAtStart(data);
      	}
      	for (int i = 0;i<index-1;i++) {
      		n = n.next;
      	}
      	node.next = n.next;
      	n.next = node;
      	
      }
      public void deleteAt(int index) {
  		
  		Node n = head;
  		Node n1= null;
  		if (index==0) {
  			n.next = head;
  			n.next = null;
  		}
  		else {
  			for (int i = 0;i<index-1;i++) {
  				n = n.next;
  			}
  		   n1 = n.next;	
  		   n.next = n1.next;
  		   n1.next = null;
  		}
}
