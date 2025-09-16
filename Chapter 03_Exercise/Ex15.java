//Ex15.java : Write a program to move a node n positions forward in a single linked list.

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

	public void moveNode(int nodeData, int n)
	{
		Node r,p,q;

		if(n <= 0)
			return;

		r = p = start;
		while(p != null)
		{
			if(p.info == nodeData)
				break;
			r = p;
			p = p.link;
		}

		if(p == null)
	    {
			System.out.println(nodeData + " does not exist.");
			return;
		}
		
		q = p;
		for(int i=1; i<=n; i++)
		{
			if(q.link == null)
			{	
				System.out.println("Cannot move " + n + " positions.");
				return;
			}
			q = q.link;
		}
		
		if(p != start)
			r.link = p.link;
		else
			start = start.link;

		p.link = q.link;
		q.link = p;

	}//End of moveNode()

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

		int nodeData = 30;
		int n = 4;

		list.moveNode(nodeData,n);

		System.out.println("List items after moving node data " + nodeData + " for " + n + " positions.");
		list.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

