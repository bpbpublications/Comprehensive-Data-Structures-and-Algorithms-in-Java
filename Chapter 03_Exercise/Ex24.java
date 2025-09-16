//Ex24.java : Write a method to delete alternate nodes (even numbered nodes) from a single linked list.

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

	public void deleteAlternate()
	{
		Node p, prev;
		
		if(start == null)
			return;
		
		prev = start;
		p = start.link;

		while(prev!=null &&  p!=null)
		{
			prev.link = p.link;

			prev = prev.link;
			if(prev != null)
	            p = prev.link;
		}

	}//End of deleteAlternate()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list = new SingleLinkedList();
		
		//Create the List
		list.insertAtBeginning(10);
		list.insertAtBeginning(9);
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

		list.deleteAlternate();

		System.out.println("List items after deleting alternate nodes :");
		list.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

