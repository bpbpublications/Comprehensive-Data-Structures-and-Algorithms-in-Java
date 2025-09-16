//Ex19.java : Write a method to remove duplicates from an unsorted single linked list.

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
		Node p1, p2;

		p1=start; 
	   
		while(p1 != null) 
		{ 
			p2 = p1; 
			while(p2.link != null) 
			{ 
				if(p1.info == p2.link.info) 
				{
					p2.link = p2.link.link; 
				} 
				else 
					p2 = p2.link; 
			} 
			p1 = p1.link; 
	  } 
	}//End of removeDuplicates()

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

		list.removeDuplicates();

		System.out.println("List items after removing duplicates :");
		list.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

