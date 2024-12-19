
public class LinkedList {
	
	public class Node{
		
		int val;
		Node next;
		
		public Node(int val) {
			
			this.val=val;
			this.next=null;
		}
	}
	
	static Node head = null;
	static Node tail = null;
	
	public void addAtStart(int val) {
		Node newNode = new Node(val);
		
		if(head==null) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.next=head;
			head = newNode;
		}
	}
	
	public void addAtEnd(int val) {
		Node newNode = new Node(val);
			if(head==null) {
				head = newNode;
				tail= newNode;
			}else {
				tail.next=newNode;
				tail= newNode;
			}
		}
	
	public void addAtGivenIndex(int index, int val) {
		
		Node current = head;
		int count = 1;
		
		while(current!=null && count!=index-1) {
			current = current.next;
			count ++;
		}
		Node newNode = new Node(val);
		
		Node temp = current.next;
		current.next = newNode;
		newNode.next = temp;
	}
	
	public void delteAtStart() {
		
		if(sizeOfLinkedList(head)==1) {
			head = null;
			tail = null;
		}else {
			head = head.next;
		}
	}
	
	public void delteAtEnd() {
		
		if(sizeOfLinkedList(head)==1) {
			head = null;
			tail = null;
		}else {
			Node current = head;
			
			while(current.next.next!=null) {
				current = current.next;
			}
			current.next=null;
			tail=current;
		}
		
	}
	
    public void delteAtGivenIndex(int index) {
		
		if(sizeOfLinkedList(head)==1) {
			head = null;
			tail = null;
		}else {
			Node current = head;
			int count =1;
			
			while(current!=null && count!= index-1) {
				current = current.next;
				count ++;
			}
			
			current.next=current.next.next;
			
		}
		
	}

	private int sizeOfLinkedList(Node head) {
		int count =0;
		
		Node current = head;
		
		while(current!=null) {
			current=current.next;
			count ++;
		}
		return count;
	   }
	
	public void printLinkedList(Node head) {
		
		Node current = head;
		
		while(current!=null) {
			
			System.out.println(current.val);
			current=current.next;

		}
		
	}
	
	public void reverseLinkedList() {
		
		Node prev = null;
		Node next = null;
		Node current = head;
		
		while(current!=null) {
			next = current.next;
			current.next=prev;
			prev= current;
			current=next;
		}	
		
		printLinkedList(prev);
		
	}
	
	
	public static void main(String args[]) {
		
		LinkedList li = new LinkedList();
		li.addAtStart(10);
		li.addAtStart(20);
		li.addAtStart(30);
		li.addAtStart(40);
		li.addAtStart(50);
		
		System.out.println("*****Add at the start ****");
		li.printLinkedList(head);
		
		System.out.println("***** Add at the Given Index ****");
		li.addAtGivenIndex(3,25);
		li.printLinkedList(head);
		
		System.out.println("***** Add at the End ****");
		li.addAtEnd(60);
		li.printLinkedList(head);
		
		System.out.println("***** Delete at the Start ****");
		li.delteAtStart();
		li.printLinkedList(head);
		
		System.out.println("***** Delete at the End ****");
		li.delteAtEnd();
		li.printLinkedList(head);
		
		System.out.println("***** Delete at the Given Index ****");
		li.delteAtGivenIndex(3);
		li.printLinkedList(head);
		
		System.out.println("*****Print reverse linked list ****");
		li.reverseLinkedList();
		
		
		
		
	}
	
	}


