package linkedList;

import java.util.Scanner;

public class SingleLinked_List {
	private Node head;
	
	public SingleLinked_List() {
		head=null;	
	}

	public void setHead(Node newnode) {
		this.head = newnode;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public Node createNewNode() {
		Node newnode = new Node();
		System.out.println("Enter Data value:");
		newnode.setData(sc.nextInt());
		newnode.setNext(null);
		return newnode;
	}
	 
	public void addstart() {
		Node newnode = createNewNode();
		if(head==null) {
			head=newnode;
		}
		else 
		{
			newnode.setNext(head);
			head = newnode;
		}		
	}
	
	public void deletefromstart() {
		Node temp = null;
		if(head==null) {
			System.out.println("\n\nLinkedList is Empty.....");
		} 
		else
		{
			temp = head;
			head = head.getNext();
			temp.setNext(null);
			System.out.println("node is deleted");	
		}
	}
	
	public void addlast() {
		Node newnode = createNewNode();
		if(head==null) {
			head=newnode;
		}
		else 
		{
			Node temp=head;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(newnode);
		}
	}
	
	public void deletefromend() {
		Node temp = head;
		if(head==null) {
			System.out.println("\n\nLinkedList is Empty.....");
		} else if(head.getNext() == null) {
			head = null;
			System.out.println("node is deleted");
		}
		else 
		{ 
			while(temp.getNext().getNext() != null) {
				temp = temp.getNext();
			}
//			 temp.setNext(temp.getNext());
			temp.setNext(null);
			System.out.println("node is deleted");
		}
	}
	
	public void AddMid(int value) {
		Node newnode = createNewNode();
		Node temp=null;
		if(head==null) {
			head=newnode;
		}
		else if(head.getNext() == null) {
			if(head.getData()==value) {
				head.setNext(newnode);
			} 
			else 
			{
				System.out.println("\tError::Node not exists....!!!!");
			}
		} 
		else {
			temp=head;
			while(temp!=null && temp.getData()!=value) {
				temp=temp.getNext();
			}
			if(temp!=null) {
				newnode.setNext(temp.getNext());
				temp.setNext(newnode);
			}
		}
	}
	
	public void deletefrommid(int value) {
		Node temp = head;
		Node tag = null;
		if(head==null) {
			System.out.println("\n\nLinkedList is Empty.....");
		} else if(head.getNext() == null) {
			if(head.getData()==value) {
				head.setNext(null);
				System.out.println("node is deleted");
			} 
			else 
			{
				System.out.println("\tError::Node not exists....!!!!");
			}
		}
		else 
		{ 
			while(temp!=null && temp.getData() != value) {
				tag = temp;
				temp = temp.getNext();
			}
			if(temp!=null) {
				tag.setNext(temp.getNext());
				temp.setNext(null);
			}
			System.out.println("node is deleted");
		}
	}
	
	public void updatevalue(int value) {
		Node temp = head;
		int upvalue;
		if(head==null) {
			System.out.println("\n\nLinkedList is Empty.....");
		}else if(head.getNext() == null) {
			if(head.getData()==value) {
				System.out.println("Enter New value::");
				upvalue = sc.nextInt();
				head.setData(upvalue);
				System.out.println("node is updated");
			}
		} 
		else 
		{
			while (temp != null && temp.getData() != value) {
				temp = temp.getNext();
			}
			if(temp != null) {
				System.out.println("Enter New value::");
				upvalue = sc.nextInt();
				temp.setData(upvalue);
				System.out.println("node is updated");
			}
		}
	}
	
	public void reverselist() {
		Node prev = head;
		Node curr = null;
		Node next = null;
		
		if(prev!=null) {
			curr=head.getNext();
		} 
		if (curr != null || curr.getNext()!=null) {
			next=curr.getNext();
		}
			while(curr != null) 
			{
				curr.setNext(prev);
				prev = curr;
				curr = next;
				
				if(next!=null) {
					next = next.getNext();
				}
			}
			
			head.setNext(null);
			head=prev;
			
			System.out.println("List is reversed");
	}
	
	public void display() {
		Node temp = head;
		if(head==null) {
			System.out.println("\n\nLinkedList is Empty.....");
		}
		else
		{
			while(temp!=null) {
				System.out.print(temp.getData()+"->");
				temp = temp.getNext();
			}
			System.out.println("null");
		}
	}
	
	public int getCount() {
		int count=0;
		if(head==null) {
			return count;
		}
		else 
		{
			Node temp=head;
			while(temp!=null) {
				count++;
				temp = temp.getNext();
			}
		}
		System.out.println("Count is: "+count);
		return count;
	}
	
	public void findmax() {
		Node temp=head;
		int max=head.getData();
		while(temp.getNext()!=null) {
			if(max<temp.getNext().getData()) {
				max=temp.getNext().getData();
			}
			temp= temp.getNext();
		}
		System.out.println("Max value is:: "+max);
	}
	
	public void findOccurence(int value) {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			if(temp.getData()==value) {
				count++;
			}
			temp= temp.getNext();
		}
		System.out.println("Occurancee is:: "+count);
		
	}
	
}
