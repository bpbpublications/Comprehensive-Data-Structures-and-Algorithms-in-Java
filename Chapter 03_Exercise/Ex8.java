//Ex8.java : Write a program to swap the first and last elements of a single linked list
//(i) by exchanging info part (ii) by rearranging links.

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

	public void swapFirstLastInfo()
	{
		Node p = start;
		int temp;

		if(p==null || p.link==null) //List empty or ony one element in the list
			return;

		while(p.link != null)
			p = p.link;

		//Now p refers to last node
		temp = start.info;
		start.info = p.info;
		p.info = temp;
	}//End of SwapFirstLastInfo()

	public void swapFirstLast()
	{
		Node p = start, psave;
		if(p==null || p.link==null) //List empty or only one element in the list
			return;

		if(p.link.link == null) //only two elements
		{
			p.link.link = start;
			start = p.link;
			p.link = null;
			return;
		}
		
		while(p.link.link != null)
			p = p.link;
		
		//Now p points to second last node
		p.link.link = start.link;
		psave = p.link;
		p.link = start;
		p.link.link=null;  
		start = psave;

	}//End of swapFirstLast()

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

		list1.swapFirstLastInfo();

		System.out.println("List1 items after swaping first and last elements using info :");
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

		list2.swapFirstLast();

		System.out.println("List2 items after swaping first and last elements using links :");
		list2.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

