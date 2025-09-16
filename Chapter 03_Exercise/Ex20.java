//Ex20.java : Write a method to create a linked list that is intersection of two single linked lists, i.e. it contains only the 
//elements which are common to both the lists.

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
	
	public void insertAtEnd(int data)
	{
		Node p,temp;

		temp = new Node(data);

		if(isEmpty())
			start = temp;
		else
		{
			p = start;
			while(p.link != null)
				p = p.link;

			p.link = temp;
		}
	}//End of insertAtEnd()
	
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

	private boolean isPresent(int data)
	{
		Node p = start;

		while(p!=null)
		{
			if(p.info == data)
				return true;
			p=p.link;
		}

		return false;
	}//End of isPresent()

	public void intersectionLists(SingleLinkedList list2, SingleLinkedList list3)
	{
		Node p = start;

		while(p!=null)
		{
			if(list2.isPresent(p.info))
				list3.insertAtEnd(p.info);			
			p=p.link;		
		}

	}//End of intersection()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
		SingleLinkedList list3 = new SingleLinkedList();
		
		//Create the List
		list1.insertAtEnd(10);
		list1.insertAtEnd(20);
		list1.insertAtEnd(30);
		list1.insertAtEnd(40);
		list1.insertAtEnd(50);
		list1.insertAtEnd(60);

		System.out.println("List1 items :");
		list1.display();

		//Create the List
		list2.insertAtEnd(10);
		list2.insertAtEnd(15);
		list2.insertAtEnd(30);
		list2.insertAtEnd(35);
		list2.insertAtEnd(40);
		list2.insertAtEnd(60);

		System.out.println("List2 items :");
		list2.display();

		list1.intersectionLists(list2,list3);
		System.out.println("Intersection of List1 and List2 :");
		list3.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

