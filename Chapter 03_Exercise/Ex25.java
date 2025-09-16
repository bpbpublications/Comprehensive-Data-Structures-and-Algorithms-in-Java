//Ex25.cpp : Write a function to get the nth node from the end of a single linked list, without counting the elements or reversing 
//the list.

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

	public int getNthNode(int n) throws Exception	
	{
		Node p1,p2;

		if(start == null)
			throw new Exception("List is empty.");;

		p1 = p2 = start;
	  
		for(int i=0; i<n; i++) //Move the reference p1 n times
		{
			if(p1 == null)
				throw new Exception("List is smaller.");

			p1 = p1.link;
		}
	  
		while(p1 != null) //Move both pointers till p1 becomes NULL
		{
			p1 = p1.link;
			p2 = p2.link;
		}

		return p2.info;	
	}//End of getNthNode()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list = new SingleLinkedList();
		
		//Create the List
		list.insertAtBeginning(80);
		list.insertAtBeginning(70);
		list.insertAtBeginning(60);
		list.insertAtBeginning(50);
		list.insertAtBeginning(40);
		list.insertAtBeginning(30);
		list.insertAtBeginning(20);
		list.insertAtBeginning(10);

		System.out.println("List items :");
		list.display();

		int n = 4;
		try
		{
			System.out.println("Node number " + n + " from end of list : " + list.getNthNode(n));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
	}//End of main()	
}//End of class SingleLinkedListDemo
