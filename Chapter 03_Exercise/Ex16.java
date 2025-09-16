//Ex16.java : Write a method to delete a node from a single linked list. The only information we have is a reference to the node 
//that has to be deleted.

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

	private void deleteNode(Node p)
	{
		if(p.link==null)	//If p refers to last node
		{
			System.out.println("Can not delete last node");
			return;
		}

		p.info = p.link.info;
		p.link = p.link.link;

	}//End of deleteNode()

	public void deleteNode(int nodeData)
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
			deleteNode(p);

	}//End of deleteNode()

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

		int nodeData = 50;
		list.deleteNode(nodeData);

		System.out.println("List items after deleting node with value " + nodeData);
		list.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo


