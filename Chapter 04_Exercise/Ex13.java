//Ex13.java : Copy a queue Q1 to another queue Q2.

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

class QueueL
{
	private Node front;
	private Node rear;

	public QueueL()
	{
		front = null;
		rear = null;
	}//End of QueueL()

	public boolean isEmpty()
	{
		return (front == null);
	}//End of isEmpty()

	public void enqueue(int data)
	{
		Node temp;

		temp = new Node(data);

		if(isEmpty()) //If queue is empty
			front = temp;
		else
			rear.link = temp;

		rear = temp;
	}//End of enqueue()

	public int dequeue() throws Exception
	{
		int retValue;

		if(isEmpty())
			throw new Exception("Queue is empty");
		else 
		{
			retValue = front.info;
			front = front.link;
		}

		return retValue;
	}//End of dequeue()	

	public int peek() throws Exception
	{
		if(isEmpty())
			throw new Exception("Queue is empty");

		return front.info;
	}//End of peek()	

	public void display()
	{
		Node p;

		if(!isEmpty())
		{
			p = front;
			while(p != null)
			{
				System.out.println(p.info);
				p = p.link;
			}
		}
		else
			System.out.println("Queue is empty");
	}//End of display()	

	public int size()
	{
		Node p;
		int count = 0;

		p = front;
		while(p != null)
		{
			count++;
			p = p.link;
		}

		return count;
	}//End of size()	
		
}//End of class QueueL

class QueueLDemo
{
	public static void main(String[] args)
	{
		QueueL qu1 = new QueueL();
		QueueL qu2 = new QueueL();

		try
		{
			qu1.enqueue(1);
			qu1.enqueue(2);
			qu1.enqueue(3);
			qu1.enqueue(4);
			qu1.enqueue(5);
	
			System.out.println("Queue1 Items :");
			qu1.display();
	
			int size = qu1.size();
	
			for(int i=0; i<size; i++)
			{
				qu1.enqueue(qu1.peek());
				qu2.enqueue(qu1.peek());
				qu1.dequeue();
			}
	
			System.out.println("After copy queue1 items :");
			qu1.display();
	
			System.out.println("After copy queue2 items :");
			qu2.display();
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}

	}//End of main()
}//End of class QueueLDemo







