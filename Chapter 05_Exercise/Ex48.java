//Ex48.java : Write a recursive function to create a copy of a single linked list.

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
		
	private Node copy(Node start)
	{
		Node temp;
		if(start == null)
			return null;
		temp = new Node(start.info);
		temp.link = copy(start.link);
		return temp;
	}//End of copy()	

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
		if(start == null)
			return;

		list.start = copy(start);
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
