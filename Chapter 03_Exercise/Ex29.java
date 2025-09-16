//Ex29.java : Write a method to split a single linked list into two lists such that the alternate nodes (even numbered nodes) go 
//to a new list.

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

	public void alternateSplit(SingleLinkedList list)
	{
		Node prev,p;
		
		if(start == null)
			return;
		
		list.start = start.link;
		
		prev = start;
		p = start.link;
		
		while(p != null)
		{
			prev.link = p.link;
			prev = prev.link;

			if(prev == null)
	            p.link = null;
			else
				p.link = prev.link;
			p = p.link;
		}

	}//End of alternateSplit()

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

		list1.alternateSplit(list2);

		System.out.println("After alternate splitting list1 items :");
		list1.display();

		System.out.println("List2 items :");
		list2.display();
	}//End of main()	
}//End of class SingleLinkedListDemo

