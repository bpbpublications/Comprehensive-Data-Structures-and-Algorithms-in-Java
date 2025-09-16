//Ex33.java : Write a method to add two numbers represented by doubly linked lists. Each node of the list can store 4 digits of the 
//given number.

class Node
{
	public int info;
	public Node prev;
    public Node next;

	public Node(int data)
	{
        info = data;
        prev = null;
        next = null;
	}
}//End of class Node

class DoublyLinkedList
{
	private Node start;

	public DoublyLinkedList()
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
		{
			temp.next = start;
			start.prev = temp;
		}

		start = temp;
	}//End of insertAtBeginning()	
	
	public void insertAtEnd(int data)
	{
		Node p, temp;

		temp = new Node(data);

		if(isEmpty())
			start = temp;
		else
		{
			p = start;
			while (p.next != null)
				p = p.next;

			p.next = temp;
			temp.prev = p;
		}
	}//End of insertAtEnd()	
	
	public void display()
	{
		Node p;

		if(!isEmpty())
		{
			p = start;
			while(p != null)
			{
				System.out.print(p.info + " ");
				p = p.next;
			}
			System.out.println();
		}
		else
			System.out.print("List is empty");
	}//End of display()

	public void createList(String str)
	{
		int i, j, x=0;
		char[] temp = new char[100];

		i = str.length()-1;

		while(i != -1)
		{
			if(i < 3)
			{
				j = i;	
				x = i+1;
			}
			else
				j = 3;

			while(j!=-1 && i!=-1)
			{
				temp[j] = str.charAt(i);
				j--;
				i--;
			}
			
			if(x == 0)
				temp[4]='\0';
			else
				temp[x]='\0';

			int num = 0;
			int length = x == 0 ? 4 : x;

		    for (int k=0; k<=length-1; k++)
		    {
		         int digit = temp[k]-'0';
		         num *= 10;
		         num += digit;
		    }
		    
			insertAtEnd(num);
		}//End of while

	}//End of createList()

	public void displayNumber()
	{
		Node p;
		int d, num;

		if(start == null)
		{
			System.out.println("List is empty");
			return;
		}

		p = start;
		while(p.next != null)
			p = p.next;
		
		while(p != null)
		{
			if(p.next != null)
			{
				//If number is of 3 digits display 1 zero, if 2 digits display 2 zeros, if 1 digit display 3 zeros
				num = p.info;		
				d = 1;
				while(num/10 != 0)
				{
					d++;	
					num /= 10;
				}

				if(d == 1)
					System.out.print("000");
				else if(d == 2)
					System.out.print("00");
				else if(d == 3)
					System.out.print("0");
			}

			System.out.print(p.info);
			p = p.prev;
		}//End of while

		System.out.println();

	}//End of displayNumber()

	public void addNumberList(DoublyLinkedList list2, DoublyLinkedList list3)
	{
		int carry, total, num=0;
		Node p, q;
		
		carry = 0;
		p = start;
		q = list2.start;
		
		while(p!=null && q!=null)
		{
			total = p.info + q.info + carry;
			num = total % 10000;
			carry = total / 10000;
			list3.insertAtEnd(num);
			p = p.next;
			q = q.next;
		}
		while(p != null)
		{
			total = p.info + carry;
			num = total % 10000;
			carry = total / 10000;
			list3.insertAtEnd(num);
			p = p.next;
		}
		
		while(q != null)
		{
			total = q.info + carry;
			num = total % 10000;
			carry = total / 10000;
			list3.insertAtEnd(num);
			q = q.next;
		}

		if(carry == 1)
			list3.insertAtEnd(num);

	}//End of addNumberList()

}//End of class DoublyLinkedList

class DoublyLinkedListDemo
{
	public static void main(String[] args)
	{
		DoublyLinkedList list1 = new DoublyLinkedList();
		DoublyLinkedList list2 = new DoublyLinkedList();
		DoublyLinkedList list3 = new DoublyLinkedList();
		
		//Create the List
		String str1 = "23156782913287";
		list1.createList(str1);

		System.out.println("List1 :");
		list1.display();
		System.out.println("List1 number :");
		list1.displayNumber();

		//Create the List
		String str2 = "1";
		list2.createList(str2);

		System.out.println("List2 :");
		list2.display();
		System.out.println("List2 number :");
		list2.displayNumber();

		list1.addNumberList(list2,list3);

		System.out.println("List3 :");
		list3.display();
		System.out.println("List3 number :");
		list3.displayNumber();	
	}//End of main()	
}//End of class DoublyLinkedListDemo

