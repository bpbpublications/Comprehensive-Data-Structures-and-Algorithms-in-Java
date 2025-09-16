//Ex22.java : Given a list L1, delete all the nodes having negative numbers in info part and insert them into list L2 and all the 
//nodes having positive numbers into list L3. No new nodes should be allocated.

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

	public void positiveNegativeList(SingleLinkedList list2, SingleLinkedList list3)
	{
		Node p1 = start, p2 = list2.start, p3 = list3.start;

		while(p1 != null)
		{
			if((p1.info) < 0) //Insert in negative number list
			{
				if(list2.start == null)
					p2 = list2.start = p1;
				else
				{
					p2.link = p1;
					p2 = p2.link;
				}
			}
			else	//Insert in positive number list
			{
				if(list3.start == null)
					p3 = list3.start = p1;
				else
				{
					p3.link = p1;
					p3 = p3.link;
				}
			}
			p1 = p1.link;
		}

		if(p2 != null)
			p2.link = null;
		if(p3 != null)
			p3.link = null;
		start=null;

	}//End of positiveNegativeList()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
		SingleLinkedList list3 = new SingleLinkedList();
		
		//Create the List
		list1.insertAtBeginning(95);
		list1.insertAtBeginning(-90);
		list1.insertAtBeginning(80);
		list1.insertAtBeginning(70);
		list1.insertAtBeginning(-60);
		list1.insertAtBeginning(50);
		list1.insertAtBeginning(40);
		list1.insertAtBeginning(-30);
		list1.insertAtBeginning(-20);
		list1.insertAtBeginning(10);

		System.out.println("List1 items :");
		list1.display();

		list1.positiveNegativeList(list2,list3);

		System.out.println("Negative number list items :");
		list2.display();

		System.out.println("Positive number list items :");
		list3.display();		
	}//End of main()	
}//End of class SingleLinkedListDemo

