//Ex28.java : Write a method to split a single linked list into two lists at a node containing the given information.

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

	public void split(int nodeData, SingleLinkedList list)
	{
		Node p = start;
		
		while(p != null)
		{
			if(p.info == nodeData)
				break;
			p = p.link;
		}

		if(p == null)
	    {
			System.out.println(nodeData + " is not in the list.");
			return;
		}

		list.start = p.link;
		p.link = null;

	}//End of split()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
		
		//Create the List
		list1.insertAtBeginning(80);
		list1.insertAtBeginning(70);
		list1.insertAtBeginning(60);
		list1.insertAtBeginning(50);
		list1.insertAtBeginning(40);
		list1.insertAtBeginning(30);
		list1.insertAtBeginning(20);
		list1.insertAtBeginning(10);

		System.out.println("List1 items :");
		list1.display();

		int nodeData = 30;
		list1.split(nodeData, list2);

		System.out.println("After splitting list1 items :");
		list1.display();

		System.out.println("List2 items :");
		list2.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

