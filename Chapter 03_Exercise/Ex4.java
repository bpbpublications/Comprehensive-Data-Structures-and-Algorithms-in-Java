//Ex4.java : Write a method to create a copy of a single linked list.

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

	public void copy(SingleLinkedList list)
	{
		Node p1, p2, temp;
		
		if(start == null)
			return;
	   	
		p1=start;
		temp = new Node(p1.info);
		p2 = list.start = temp;
		p1 = p1.link;

		while(p1 != null)
		{
			temp = new Node(p1.info);
			p2.link = temp;
			p2 = temp;
			p1 = p1.link;
		}

		p2.link=null;

	}//End of copy()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
		
		//Create the List
		list1.insertAtBeginning(50);
		list1.insertAtBeginning(40);
		list1.insertAtBeginning(30);
		list1.insertAtBeginning(20);
		list1.insertAtBeginning(10);

		System.out.println("List1 items :");
		list1.display();

		//Copy list1 items to list2
		list1.copy(list2);

		System.out.println("List2 items :");
		list2.display();	
	}//End of main()	
}//End of class SingleLinkedListDemo
