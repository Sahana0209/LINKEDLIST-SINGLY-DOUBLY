

class Node{
	int data;
	Node prev,next;
	
//	constructor
	Node(int data){
		this.data = data;
		this.next = this.prev = null; // or prev = next = null;
	}
}

class SinglyLinkedList{
	
	Node head;

	public void InsertAtBegin(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	public void InsertAtEnd(int data){
		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
			return ;
		}
		Node temp = head;
		
		
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void DeleteAtBeginning() {
		if (head == null) {
			return;
		}
		
		head = head.next;
	}
	
	public void InsertAtSpecificPosition(int data, int pos) {
		if (pos<1) {
			InsertAtBegin(data);
			return;
		}
		
		Node temp = head; 
		Node newNode = new Node(data);
		
		for (int i =1; temp != null && i<pos-1;i++) {
			temp = temp.next;
		}
		
		if (temp == null) {
			System.out.println("Position out of index");
		}
		
		else {
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	public void DeleteAtEnd() {
		if(head == null) {
			return;
		}
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		
		temp.next = null;
		
	}
	
	public void DeleteAtSpecificPosition(int pos) {
		if (pos<1) {
			System.out.println("Position out of bounds");
		}
		
		Node temp = head;
		for (int i =1; temp != null && i<pos-1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	public void display() {
		
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		
		System.out.print("null");
		System.out.print("\n");

	}
	
}

class DoublyLinkedList {
	Node head;
	Node prev;
	public void InsertAtBegin(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	
	public void DeleteAtBegin() {
		if (head ==null) {
			return;
		}
		head = head.next;
		
	}
	
	public void InsertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		
		while (temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}
	
	public void DeleteAtEnd() {
		if (head == null) {
			return;
		}
		
		Node temp = head;
		while (temp.next.next !=null) {
			temp = temp.next;
		}
		
		temp.next = null;
		
	}
	
	public void InsertAtSpecificPosition(int data, int pos) {
		if (pos <1) {
			InsertAtBegin(data);
			return;
		}
		
		Node newNode = new Node(data);
		
		Node temp = head;
		for (int i =1; temp!=null && i<pos-1; i++) {
			temp = temp.next;
		}
		
		if (temp == null) {
			System.out.println("Position out of bounds");
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		newNode.prev = temp;
		
		if (newNode.next != null) {
			newNode.next.prev = newNode;
		}
			
		
		
	
	}
	public void display() {
		Node temp = head;
		System.out.print("null <-> ");
		while (temp!=null) {
			System.out.print(temp.data + " <-> ");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.print("\n");

	}
}
	
public class LinkedList{	
	public static void main(String args[]) {

		
//		SinglyLinkedList sll = new SinglyLinkedList();
//		
//		sll.InsertAtBegin(10);
//		sll.InsertAtBegin(20);
//		sll.InsertAtBegin(30);
//		sll.InsertAtBegin(40);
//		sll.InsertAtBegin(50);
//		sll.display();
//
//		sll.InsertAtEnd(70);
//		sll.InsertAtEnd(80);
//		sll.display();
//
////		sll.DeleteAtBeginning();
////		sll.DeleteAtBeginning();
//
//		sll.display();
//		
//		sll.InsertAtSpecificPosition(100, 3);
//		sll.display();
//		
//		sll.DeleteAtEnd();
//		sll.display();
//		
//		sll.DeleteAtSpecificPosition(2);
//		sll.display();
		
		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.InsertAtBegin(10);
		dll.InsertAtBegin(20);
		dll.InsertAtBegin(30);
		dll.InsertAtBegin(40);
		dll.InsertAtBegin(50);
		dll.display();
		
		dll.DeleteAtBegin();
		dll.display();
		
		dll.InsertAtEnd(60);
		dll.display();

		
		
		dll.DeleteAtEnd();
		dll.display();
//		
		dll.InsertAtSpecificPosition(2, 70);
//		sll.DeleteATSpecificPosition(2);
		dll.display();

	}
}
