//Ex2.java : Write a method to find the smallest and largest element of a single linked list.

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

	public int smallest()
	{
		Node p;
		int small = start.info;

		p = start;
		while(p != null)
		{
			if(p.info < small)
				small = p.info;
			p = p.link;
		}

		return small;
	}//End of smallest()

	public int largest()
	{
		Node p;
		int large = start.info;

		p = start;
		while(p != null)
		{
			if(p.info > large)
				large = p.info;
			p = p.link;
		}

		return large;
	}//End of largest()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list = new SingleLinkedList();

		//Create the List
		list.insertAtBeginning(7);
		list.insertAtBeginning(3);
		list.insertAtBeginning(6);
		list.insertAtBeginning(11);
		list.insertAtBeginning(9);
		list.insertAtBeginning(8);
		list.insertAtBeginning(1);
		list.insertAtBeginning(4);
		list.insertAtBeginning(5);
		list.insertAtBeginning(2);

		System.out.println("List items :");
		list.display();

		System.out.println("Smallest element : " + list.smallest());
		System.out.println("Largest element : " + list.largest());
		
	}//End of main()	
}//End of class SingleLinkedListDemo
