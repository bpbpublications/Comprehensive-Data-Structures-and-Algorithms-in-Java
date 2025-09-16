//Ex30.java : Write a method to combine the alternate nodes of two null terminated single linked lists.

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

	public void combineAlternateNodes(SingleLinkedList list)
	{
		Node p1, p2, pnext;
		p1 = start;
		p2 = list.start;

		if(p1 == null) //If first list is empty
		{
			start = list.start;
			list.start = null;
			return;
		}

		if(p2==null) //If second list is empty
			return;

		while(p1.link!=null && p2!=null)
		{
			pnext = p1.link;
			p1.link = p2;
			p1 = pnext;
			pnext = p2.link;
			p2.link = p1;
			p2=pnext;
		}

		if(p1.link==null)
			p1.link = p2;

		list.start = null;
	}//End of combineAlternateNodes()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
		
		//Create the List1
		list1.insertAtBeginning(50);
		list1.insertAtBeginning(40);
		list1.insertAtBeginning(30);
		list1.insertAtBeginning(20);
		list1.insertAtBeginning(10);

		System.out.println("List1 items :");
		list1.display();

		//Create the List2
		list2.insertAtBeginning(35);
		list2.insertAtBeginning(25);
		list2.insertAtBeginning(15);

		System.out.println("List2 items :");
		list2.display();

		list1.combineAlternateNodes(list2);

		System.out.println("After combining alternate nodes, list1 items :");
		list1.display();

		System.out.println("List2 items :");
		list2.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo
