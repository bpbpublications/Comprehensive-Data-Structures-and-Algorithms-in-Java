//Ex13.java : Write a program to remove first node of the list and insert it at the end, without changing info part of any node.

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

	public void removeFirstInsertAtEnd()
	{
		Node p;
		p = start;

		if(start==null || start.link==null)//list empty or only one element in the list
			return;

		while(p.link != null)
			p = p.link;

		//Now p refers to last node
		p.link = start;
		start = start.link;
		p.link.link = null;

	}//End of removeFirstInsertAtEnd()

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

		list.removeFirstInsertAtEnd();

		System.out.println("List items after removing first and inserting at end :");
		list.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

