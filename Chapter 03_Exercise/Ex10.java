//Ex10.java : Write a function to move the smallest element to the beginning of a single linked list.

class Node
{
	public int info;
	public Node link;

	public Node(int data)
	{
		info = data;
		link = null;
	}
}//End of class Node

class SingleLinkedList
{
	private Node start;

	public SingleLinkedList()
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
			temp.link = start;

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
				p = p.link;
			}
			System.out.println();
		}
		else
			System.out.println("List is empty");
	}//End of display()

	public void moveSmallestAtBeginning()
	{
		Node p,q;
		int temp;

		if(start == null)
			return;
		
		p = start;
		q = start.link;
		while(q != null)
		{
			if(p.info > q.info )
			{
				temp = p.info;
				p.info = q.info;
				q.info = temp;
			}
			q = q.link;
		}
	}//End of moveSmallestAtBeginning()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list = new SingleLinkedList();
		
		//Create the List
		list.insertAtBeginning(7);
		list.insertAtBeginning(3);
		list.insertAtBeginning(6);
		list.insertAtBeginning(11);
		list.insertAtBeginning(9);
		list.insertAtBeginning(8);
		list.insertAtBeginning(1);
		list.insertAtBeginning(4);
		list.insertAtBeginning(5);
		list.insertAtBeginning(2);

		System.out.println("List items :");
		list.display();

		list.moveSmallestAtBeginning();

		System.out.println("List items after moving smallest at beginning :");
		list.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

