//Ex14.java : Implement a data structure that supports stack push and pop operations and returns the minimum element.

class Node
{
    public int info;
	public int min;
    public Node link;

    public Node(int data, int minimum)
	{
    	info = data;
		min = minimum;
        link = null;
	}
}//End of class Node

class StackL
{
    private Node top;

    public StackL()
    { 
    	top = null;
    }//End of StackL()

    private boolean isEmpty()
    {
        return (top == null);
    }//End of isEmpty()    
    
    public void push(int data)
    {
    	Node temp;
    	int min;

    	if(top==null || top.min>data)
    		min = data;
    	else
    			min = top.min;

    	temp = new Node(data, min);
    	if(!isEmpty())
    		temp.link = top;

    	top = temp;
    }//End of push()
    
    public int pop() throws Exception
    {
    	int retValue;

    	if(isEmpty())
    		throw new Exception("Stack is empty");
    	else 
    	{
    		retValue = top.info;
    		top = top.link;
    	}

    	return retValue;
    }//End of pop()    
    
    int peek() throws Exception
    {
    	if(isEmpty())
    		throw new Exception("Stack is empty");

    	return top.info;
    }//End of peek()    
    
    public void display()
    {
    	Node p;

    	if(!isEmpty())
    	{
    		p = top;
    		while(p != null)
    		{
    			System.out.println(p.info);
    			p = p.link;
    		}
    	}
    	else
    		System.out.println("Stack is empty");

    }//End of display()
    
    public int size()
    {
    	Node p;
    	int count = 0;

    	p = top;
    	while(p != null)
    	{
    		count++;
    		p = p.link;
    	}

    	return count;
    }//End of size()

    public int min() throws Exception
    {
    	if(isEmpty())
    		throw new Exception("Stack is empty");

    	return top.min;
    }//End of min()   

};//End of class StackL

class StackLDemo
{
	public static void main(String[] args)
	{
		StackL st = new StackL();

		try
		{
			st.push(20);
			st.push(10);
			st.push(8);
			st.push(30);
			st.push(40);

			System.out.println("Stack Items :");
			st.display();

			System.out.println("Minimum item in stack : " + st.min());

		}//End of try
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}//End of main()
}//End of class StackLDemo













