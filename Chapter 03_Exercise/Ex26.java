//Ex26.java : Write a method to find out the middle node of a single linked list without counting all the elements of the list.

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

	public int findMiddle()
	{
		Node slow, fast;

		if(start.link == null) //only one node
			return start.info;

		slow = fast = start;
		
		//while(fast!=null && fast.link!=null) //this condition gives (n/2+1)th as the middle node in case of even nodes
		while(fast.link!=null && fast.link.link!=null) //this condition gives (n/2)th as the middle node in case of even nodes
		{
			slow = slow.link;
			fast = fast.link.link;
		}

		return slow.info;

	}//End of findMiddle()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list = new SingleLinkedList();
		
		//Create the List
		list.insertAtBeginning(80);
		list.insertAtBeginning(70);
		list.insertAtBeginning(60);
		list.insertAtBeginning(50);
		list.insertAtBeginning(40);
		list.insertAtBeginning(30);
		list.insertAtBeginning(20);
		list.insertAtBeginning(10);

		System.out.println("List items :");
		list.display();

		System.out.println("Middle node is : " + list.findMiddle());		
	}//End of main()	
}//End of class SingleLinkedListDemo



