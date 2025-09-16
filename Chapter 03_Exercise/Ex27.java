//Ex27.java : Write a method to split a single linked list into two halves.

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

	public void split(SingleLinkedList list)
	{
		Node slow, fast;

		if(start.link == null) //only one element
		{
			System.out.println("Only one element, split is not possible.");
			return;
		}
		
		slow = fast = start;
		
		while(fast.link!=null && fast.link.link!=null)
		{
			slow = slow.link;
			fast = fast.link.link;
		}

		list.start = slow.link;
		slow.link = null;
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

		list1.split(list2);

		System.out.println("After splitting list1 items :");
		list1.display();

		System.out.println("List2 items :");
		list2.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

