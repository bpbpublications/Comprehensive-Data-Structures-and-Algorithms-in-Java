//Ex51.java : Write a recursive function to insert a node in a sorted single linked list.

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

class SortedLinkedList
{
	private Node start;
		
	private Node insert(Node p, int data)
	{
		Node temp;

		if(p == null || data < p.info )
		{
			temp = new Node(data);
			temp.link = p;
			return temp;
		}

		p.link = insert(p.link, data);

		return p;
	}//End of insert()

	public SortedLinkedList()
	{
		start = null;
	}//End of SingleLinkedList()
	
	public boolean isEmpty()
	{
		return (start == null);
	}//End of isEmpty()

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

	public void insert(int data)
	{
		start = insert(start, data);
	}//End of insert()

}//End of class SortedLinkedList

class SortedLinkedListDemo
{
	public static void main(String[] args)
	{
		SortedLinkedList list = new SortedLinkedList();

		//Create the List
		list.insert(50);
		list.insert(40);
		list.insert(30);
		list.insert(20);
		list.insert(10);

		System.out.println("List items :");
		list.display();
	}//End of main()
}//End of class SortedLinkedListDemo

