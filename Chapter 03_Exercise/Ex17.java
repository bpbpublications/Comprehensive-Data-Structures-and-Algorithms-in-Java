//Ex17.java : Write methods to insert a node just before and just after a node referred to by a reference p, without using the 
//reference start.

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

	private void insertAfter(Node p, int data)
	{
		Node temp;
		temp = new Node(data);
		temp.link = p.link;
		p.link = temp;
	}//End of insertAfter()

	private void insertBefore(Node p, int data)
	{
		Node temp;
		temp = new Node(p.info);
		temp.link = p.link;
		p.link = temp;
		p.info=data;
	}//End of insertBefore()

	public void insertAfterBefore(int nodeData, int data)
	{
		Node p;

		p = start;
		while(p != null)
		{
			if(nodeData == p.info)
				break;
			p = p.link;
		}

		if(p == null)
			System.out.println("Node data " + nodeData + " does not exist.");
		else
		{
			insertAfter(p,data);
			insertBefore(p,data);
		}

	}//End of insertAfterBefore()

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

		int nodeData = 50, data = 45;
		list.insertAfterBefore(nodeData,data);

		System.out.println("List items after inserting after, before " + nodeData + " node value " + data);
		list.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

