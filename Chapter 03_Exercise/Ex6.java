//Ex6.java : Write a program to swap adjacent elements of a single linked list
//(i) by exchanging info part (ii) by rearranging links

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

	public void swapAdjacentInfo()
	{
		Node p, q;
		int temp;

		if(start==null || start.link==null) //List empty or only one element in the list
			return;

		p = start;
		while(p!=null && p.link!=null)
		{
			q = p.link;
			temp = p.info;
			p.info = q.info;
			q.info = temp;
			p = q.link;
		}

	}//End of swapAdjacentInfo()

	public void swapAdjacent()
	{
		Node r,p,q;
		if(start==null || start.link==null) //List empty or only one element in the list
			return;

		r = p = start;
		while(p.link != null)
		{
			q = p.link;
			p.link = q.link;
			q.link = p;

			if(p != start)
				r.link = q;
			else
				start = q;
			r = p;

			if(p.link != null)
				p = p.link;
		}

	}//End of swapAdjacent()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
		
		//Create the List
		list1.insertAtBeginning(8);
		list1.insertAtBeginning(7);
		list1.insertAtBeginning(6);
		list1.insertAtBeginning(5);
		list1.insertAtBeginning(4);
		list1.insertAtBeginning(3);
		list1.insertAtBeginning(2);
		list1.insertAtBeginning(1);

		System.out.println("List1 items :");
		list1.display();

		list1.swapAdjacentInfo();

		System.out.println("List1 items after swaping adjacent elements using info :");
		list1.display();

		//Create the List
		list2.insertAtBeginning(8);
		list2.insertAtBeginning(7);
		list2.insertAtBeginning(6);
		list2.insertAtBeginning(5);
		list2.insertAtBeginning(4);
		list2.insertAtBeginning(3);
		list2.insertAtBeginning(2);
		list2.insertAtBeginning(1);

		System.out.println("List2 items :");
		list2.display();

		list2.swapAdjacent();

		System.out.println("List2 items after swaping adjacent elements using links :");
		list2.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

