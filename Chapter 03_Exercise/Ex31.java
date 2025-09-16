//Ex31.java : Write a method to find the merge point (intersection point) of two single linked list.

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

	public void setMergePoint(SingleLinkedList list)
	{
		list.start = start;
	}//End of setMergePoint()

	public int intersectionPoint(SingleLinkedList list)
	{
		Node p, q;
		int len1=0, len2=0, d;
		
		p = start;
		while(p != null) //Find length of first list
		{
			len1++;
			p = p.link;
		}

		p = list.start;
		while(p != null) //Find length of second list
		{
			len2++;
			p = p.link;
		}
		
		p = start;
		q = list.start;
			
		if(len1 > len2) //If first list is longer
		{
			d = len1-len2;	
			for(int i=1; i<=d; i++)
				p = p.link;
		}
		else if(len1 < len2) //If second list is longer
		{
			d = len2-len1;	
			for(int i=1; i<=d; i++)
				q = q.link;
		}

		while(p!=null && q!=null)
		{
			if(p == q)
				break;	//Merge point found
			p = p.link;
			q = q.link;
		}

		return p.info;
	}//End of intersectionPoint()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list1 = new SingleLinkedList();
		SingleLinkedList list2 = new SingleLinkedList();
		
		//Create the List1
		list1.insertAtBeginning(80);
		list1.insertAtBeginning(70);
		list1.insertAtBeginning(60);
		list1.insertAtBeginning(50);

		list1.setMergePoint(list2);

		list1.insertAtBeginning(40);
		list1.insertAtBeginning(30);
		list1.insertAtBeginning(20);
		list1.insertAtBeginning(10);

		System.out.println("List1 items :");
		list1.display();

		//Create the List2
		list2.insertAtBeginning(35);
		list2.insertAtBeginning(25);

		System.out.println("List2 items :");
		list2.display();

		System.out.println("Merge point of List1 and List2 is : " + list1.intersectionPoint(list2));		
	}//End of main()	
}//End of class SingleLinkedListDemo

