//Ex49.java : Write a recursive function to print alternate nodes of a single linked list.

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
		
	private void displayAlternateNodes(Node p)
	{
		if(p==null)
			return;

		System.out.print(p.info + " ");
		
		if(p.link!=null)
	        displayAlternateNodes(p.link.link);
	}//End of displayAlternateNodes()	

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

	public void displayAlternateNodes()
	{
		if(!isEmpty())
		{
			displayAlternateNodes(start);
			System.out.println();
		}
		else
			System.out.println("List is empty");
	}//End of displayAlternateNodes()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list = new SingleLinkedList();

		//Create the List
		list.insertAtBeginning(50);
		list.insertAtBeginning(40);
		list.insertAtBeginning(30);
		list.insertAtBeginning(20);
		list.insertAtBeginning(10);

		System.out.println("List items :");
		list.display();		

		System.out.println("List alternate items :");
		list.displayAlternateNodes();
	}//End of main()
}//End of class SingleLinkedListDemo
