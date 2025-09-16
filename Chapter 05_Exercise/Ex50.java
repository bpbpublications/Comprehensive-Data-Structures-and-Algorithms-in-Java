//Ex50.java : Write a recursive function to delete a node from a single linked list.

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
		
	private Node del(Node p, int data)
	{
		Node temp;

		if(p == null)
			return null;

		if(p.info == data)
		{
			temp = p.link;
			return temp;
		}
		p.link = del(p.link, data);

		return p;
	}//End of del()	

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

	public void del(int data)
	{
		if(!isEmpty())
			start = del(start, data);
		else
			System.out.println("List is empty");
	}//End of del()

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

		list.del(30);
		
		System.out.println("List items after deleting 30 :");
		list.display();		
	}//End of main()
}//End of class SingleLinkedListDemo



