//Ex12.java : Given a single linked list L1 which is sorted in ascending order, and another single linked list L2 which is not 
//sorted, write a method to print the elements of second list according to the first list.

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

	public void printList(SingleLinkedList list)
	{
		Node p1, p2;
		int i = 1;

		p1 = start;
		p2 = list.start;
		
		if(p1==null || p2==null)
			return;
			
		while(p1 != null)
		{
			while(i < p1.info)
			{
				p2 = p2.link;
				if(p2 == null)
				{
					System.out.println("\nError : Less than " + p1.info + " elements");
					return;
				}
				i++;
			}
			System.out.print(p2.info + " ");
			p1 = p1.link;
		}
		System.out.println();
	}//End of printList()

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
		list1.insertAtBeginning(5);
		list1.insertAtBeginning(2);
		list1.insertAtBeginning(1);

		//Create the List
		list2.insertAtBeginning(80);
		list2.insertAtBeginning(70);
		list2.insertAtBeginning(60);
		list2.insertAtBeginning(50);
		list2.insertAtBeginning(40);
		list2.insertAtBeginning(30);
		list2.insertAtBeginning(20);
		list2.insertAtBeginning(10);

		System.out.println("List1 items :");
		list1.display();

		System.out.println("List2 items :");
		list2.display();

		System.out.println("List2 items from list1 positions :");
		list1.printList(list2);
		
	}//End of main()	
}//End of class SingleLinkedListDemo

