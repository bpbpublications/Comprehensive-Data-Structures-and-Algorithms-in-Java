//Ex3.java : Write a method to check if two linked lists are identical. Two lists are identical if they have same number of elements 
//and the corresponding elements in both lists are same.

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

	public boolean isIdentical(SingleLinkedList list2)
	{
		Node p1 = start;
		Node p2 = list2.start;

		while(true)
		{
			if((p1==null) && (p2==null))  
				return true;
			if((p1==null) || (p2==null))
				return false;
			if(p1.info != p2.info)
				return false;
			p1 = p1.link;
			p2 = p2.link ;
		}
	}//End of isIdentical()

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

		//Create the List
		list2.insertAtBeginning(50);
		list2.insertAtBeginning(40);
		list2.insertAtBeginning(30);
		list2.insertAtBeginning(20);
		list2.insertAtBeginning(10);

		System.out.println("List1 items :");
		list1.display();

		System.out.println("List2 items :");
		list2.display();

		if(list1.isIdentical(list2))
			System.out.println("List1 and List2 are identical.");
		else
			System.out.println("List1 and List2 are not identical.");		
	}//End of main()	
}//End of class SingleLinkedListDemo






