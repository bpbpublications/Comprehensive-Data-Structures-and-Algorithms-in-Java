//Ex34.java : Write a function to find whether a linked list is palindrome or not.

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

	private boolean isIdentical(SingleLinkedList list)
	{
		Node p1, p2;
		p1 = start;
		p2 = list.start;

		while(true)
		{
			if(p1==null && p2==null)
				return true;

			if(p1==null || p2==null)
				return false;

			if(p1.info != p2.info)
				return false;

			p1 = p1.link;
			p2 = p2.link ;
		}
	}//End of isIdentical()

	private void reverse()
	{
		Node prev, p, next;
		prev = null;
	   	p = start;

		while(p!=null)
		{
			next = p.link;
			p.link = prev;
			prev = p;
			p = next;
		}
		start = prev;

	}//End of reverse()

	public boolean isPalindrome()
	{
		Node slowP, fastP, prevslowP;  
		boolean result;  
	 
		if(start==null || start.link==null) //List empty or only one element
		   return true;

		prevslowP = slowP = fastP = start;

		while(fastP.link!=null && fastP.link.link!=null)
		{
			prevslowP = slowP;
			slowP = slowP.link;
			fastP = fastP.link.link;
		}

		SingleLinkedList list2 = new SingleLinkedList();

		list2.start = slowP.link;

		if(fastP.link == null) //odd number of elements in the list
	    {  
			list2.reverse(); //reverse the second half
			prevslowP.link = null; //node referred by prevslowP is last node of first half, Middle element referred by slowP will not be in any half
			result = isIdentical(list2); //compare the first half and second half
			list2.reverse(); //reverse second half to get the original order
			prevslowP.link = slowP; //Join first half with the middle element
			slowP.link = list2.start; //Join middle element with the second half
	    }  
		else //even number of elements in the list
		{  
			list2.reverse(); //reverse the second half
			slowP.link = null; //node referred by slowP is the last node of first half
			result = isIdentical(list2); //compare the first half and second half
			list2.reverse(); //reverse second half to get the original order
			slowP.link = list2.start; //Join first half and second half
		}

		return result;  
	}//End of isPalindrome()

}//End of class SingleLinkedList

class SingleLinkedListDemo
{
	public static void main(String[] args)
	{
		SingleLinkedList list = new SingleLinkedList();
		
		//Create the List
		list.insertAtBeginning(10);
		list.insertAtBeginning(20);
		list.insertAtBeginning(30);
		list.insertAtBeginning(40);
		list.insertAtBeginning(30);
		list.insertAtBeginning(20);
		list.insertAtBeginning(10);

		System.out.println("List items :");
		list.display();

		if(list.isPalindrome())
			System.out.println("List is palindrome.");
		else
			System.out.println("List is not palindrome.");		
	}//End of main()	
}//End of class SingleLinkedListDemo



