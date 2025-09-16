//Ex11.java : Write a method to sort a linked list using insertion sort.

class Node
{
	public int info;
	public	Node link;

	public	Node(int data)
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
	
	public void display()
	{
		Node p;

		if(!isEmpty())
		{
			p = start;
			while(p != null)
			{
				System.out.println(p.info);
				p = p.link;
			}
		}
		else
			System.out.println("List is empty");
	}//End of display()		
	
	public void insertAtBeginning(int data)
	{
		Node temp;

		temp = new Node(data);
		if(!isEmpty())
			temp.link = start;

		start = temp;
	}//End of insertAtBeginning()	
	
	public void insertionSort()
	{
		Node p1,p2,q;
		Node last; //last refers to last node of sorted part

		if(start==null)
			return;

		last = start; //Initially only first node is in the sorted part
	    while(last.link!=null) 
		{
				q=last.link; //q refers to the node that is to be inserted
				if(q.info < start.info) //If item to be inserted is less than first element of list then insert it at the beginning and change start
				{
					last.link = q.link;
					q.link = start;
					start = q;
				}
				else //start searching from the beginning of the list
				{ 
					p1=start;
					p2=start.link;
					while(q.info > p2.info)
					{
						p1=p2;
						p2=p2.link;
					}
					if(q==p2) //If item to be inserted is at its proper place, then make last refer to it
						last=q;
					else //insert the node at proper place
					{
						last.link = q.link;
						q.link = p2;
						p1.link = q;
					}
				}//End of else
		}//End of while

	}//End of insertionSort()	
	
}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list = new SingleLinkedList();

		//Create the List
		list.insertAtBeginning(40);
		list.insertAtBeginning(30);
		list.insertAtBeginning(50);
		list.insertAtBeginning(10);
		list.insertAtBeginning(20);

		System.out.println("Unsorted list is :");
		list.display();

		list.insertionSort();
		System.out.println("Sorted list is :");
		list.display();

	}//End of main()	
}//End of class SingleLinkedListDemo






