//Ex11.java : Write a function for deleting all the nodes from a single linked list which have a value N.

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

	public void deleteNodes(int n)
	{
		Node prev, p;
		
		if(start==null)
			return;

		//Delete all the nodes that are at the beginning of the list and have value n
		while(start!=null && start.info==n)
		{
			start = start.link;
		}
		
		prev = p = start;
		while(p != null)
		{	
			if(p.info == n)
			{
				prev.link = p.link;
				p=prev.link;
			}
			else
			{
				prev = p;
				p = p.link;
			}
		}

	}//End of deleteNodes()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list = new SingleLinkedList();
		
		//Create the List
		list.insertAtBeginning(45);
		list.insertAtBeginning(5);
		list.insertAtBeginning(35);
		list.insertAtBeginning(20);
		list.insertAtBeginning(5);
		list.insertAtBeginning(30);
		list.insertAtBeginning(10);
		list.insertAtBeginning(20);
		list.insertAtBeginning(5);
		list.insertAtBeginning(10);

		System.out.println("List items :");
		list.display();

		int n = 5;
		list.deleteNodes(5);

		System.out.println("List items after deleting the nodes having value " + n);
		list.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo


