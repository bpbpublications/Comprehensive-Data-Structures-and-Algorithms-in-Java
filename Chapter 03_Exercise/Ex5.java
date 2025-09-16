//Ex5.java : Given a linked list L, write a function to create a single linked list that is reverse of the list L. For example if the 
//list L is 1->2->3->4->5 then the new list should be 5->4->3->2->1. The list L should remain unchanged.

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

	public void createReverse(SingleLinkedList list)
	{
		Node p;
		
		if(start == null)
			return;
	   	
		p = start;
		list.insertAtBeginning(p.info);
		p = p.link;

		while(p != null)
		{
			list.insertAtBeginning(p.info);
			p = p.link;
		}

	}//End of createReverse()

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

		list1.createReverse(list2);

		System.out.println("List2 items :");
		list2.display();		
		
	}//End of main()	
}//End of class SingleLinkedListDemo





