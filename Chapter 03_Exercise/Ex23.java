//Ex23.java : Given a linked list L1, create two linked lists one having the even numbers of L1 and the other having the odd numbers 
//of L1. Don’t change the list L1.

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

	public void evenOddList(SingleLinkedList list2, SingleLinkedList list3)
	{
		Node p1 = start;

		while(p1 != null)
		{
			if((p1.info)%2 == 0) //Insert in even number list
				list2.insertAtEnd(p1.info);
			else	//Insert in odd number list
				list3.insertAtEnd(p1.info);

			p1 = p1.link;
		}

		start=null;

	}//End of evenOddList()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
		SingleLinkedList list3 = new SingleLinkedList();
		
		//Create the List
		list1.insertAtEnd(1);
		list1.insertAtEnd(3);
		list1.insertAtEnd(4);
		list1.insertAtEnd(5);
		list1.insertAtEnd(6);
		list1.insertAtEnd(8);
		list1.insertAtEnd(9);
		list1.insertAtEnd(11);
		list1.insertAtEnd(12);
		list1.insertAtEnd(14);

		System.out.println("List1 items :");
		list1.display();

		list1.evenOddList(list2,list3);

		System.out.println("Even number list items :");
		list2.display();

		System.out.println("Odd number list items :");
		list3.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

