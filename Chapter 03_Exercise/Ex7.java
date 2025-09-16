//Ex7.java : Write a program to swap adjacent elements of a double linked list by rearranging links.

class Node
{
	public int info;
	public Node prev;
    public Node next;

	public Node(int data)
	{
        info = data;
        prev = null;
        next = null;
	}
}//End of class Node

class DoublyLinkedList
{
	private Node start;

	public DoublyLinkedList()
	{
		start = null;
	}//End of SingleLinkedList()

	public boolean isEmpty()
	{
		return (start == null);
	}//End of isEmpty()
	
	public void insertAtBeginning(int data)
	{
		Node temp;

		temp = new Node(data);
		if(!isEmpty())
		{
			temp.next = start;
			start.prev = temp;
		}

		start = temp;
	}//End of insertAtBeginning()	
	
	public void display()
	{
		Node p;

		if(!isEmpty())
		{
			p = start;
			while(p != null)
			{
				System.out.print(p.info + " ");
				p = p.next;
			}
			System.out.println();
		}
		else
			System.out.print("List is empty");
	}//End of display()

	public void swapAdjacent()
	{
		Node p,q;
		if(start==null || start.next==null) //List empty or only one element in the list
			return;
		
		p = start;
		while(p.next != null)
		{
			q = p.next;
			p.next = q.next;
			q.prev = p.prev;
			if(q.next != null)
				q.next.prev = p;
			q.next=p;
			if(p!=start)
				p.prev.next=q;
			else
				start=q;
			p.prev=q;
			if(p.next!=null)
				 p=p.next;
		}

	}//End of swapAdjacent()

}//End of class DoublyLinkedList

class DoublyLinkedListDemo
{
	public static void main(String[] args)
	{
		DoublyLinkedList list = new DoublyLinkedList();
		
		//Create the List
		list.insertAtBeginning(8);
		list.insertAtBeginning(7);
		list.insertAtBeginning(6);
		list.insertAtBeginning(5);
		list.insertAtBeginning(4);
		list.insertAtBeginning(3);
		list.insertAtBeginning(2);
		list.insertAtBeginning(1);

		System.out.println("List items :");
		list.display();

		list.swapAdjacent();

		System.out.println("List items after swaping adjacent elements using links :");
		list.display();		
	}//End of main()	
}//End of class DoublyLinkedListDemo

