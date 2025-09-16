//Ex18.java : Write a method to remove duplicates from a sorted single linked list.

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

	public void removeDuplicates()
	{
		Node p;

		if(start==null)
			return;

		p=start;

		while(p.link != null)
		{
			if(p.info == p.link.info)
			{
				p.link = p.link.link;
			}
			else
				p = p.link;
		}

	}//End of removeDuplicates()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list = new SingleLinkedList();
		
		//Create the List
		list.insertAtBeginning(80);
		list.insertAtBeginning(50);
		list.insertAtBeginning(50);
		list.insertAtBeginning(50);
		list.insertAtBeginning(40);
		list.insertAtBeginning(20);
		list.insertAtBeginning(20);
		list.insertAtBeginning(10);

		System.out.println("List items :");
		list.display();

		list.removeDuplicates();

		System.out.println("List items after removing duplicates :");
		list.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo


