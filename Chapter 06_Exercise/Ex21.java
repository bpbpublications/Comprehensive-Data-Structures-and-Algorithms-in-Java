//Ex21.java : Write a method that displays all root to leaf paths in a binary tree.

class Node
{
	public int info;
	public Node lchild;
	public Node rchild;

	public Node(int key)
	{
		info = key;
		lchild = null;
		rchild = null;
	}
}//End of class Node

class BinarySearchTree
{
	static final int MAX_SIZE = 30;
	private Node root;

	public BinarySearchTree()
	{
		root = null;
	}//End of BinarySearchTree()

	//Non Recursive insertion
	public void insert(int key)
	{
		Node parent = null;
		Node p = root;

		while(p != null)
		{
			parent = p;

			if(key < p.info)
				p = p.lchild;
			else if(key > p.info)
				p = p.rchild;
			else
			{
				System.out.println(key + " is already there");
				return;
			}
		}

		Node temp = new Node(key);

		if(parent == null)
			root = temp;
		else if(key < parent.info)
			parent.lchild = temp;
		else
			parent.rchild = temp;
	}//End of insert()		

	private void display(Node p, int level)
	{
		if(p == null)
			return;

		display(p.rchild, level+1);
		System.out.println();

		for(int i=0; i<level; i++)
			System.out.print("    ");
		System.out.print(p.info);

		display(p.lchild, level+1);
	}//End of display()

	public void display()
	{
		display(root, 0);
	}//End of display()		
	
	private void displayPaths(Node p, int[] path, int n)
	{ 
		if(p==null) 
			return;

		path[n++] = p.info; 
		
		if(p.lchild==null && p.rchild==null) 
		{
			for(int i=0; i<n; i++) 
				System.out.print(path[i] + " ");
			System.out.println();
		}	
		else 
		{ 
		    displayPaths(p.lchild, path, n); 
			displayPaths(p.rchild, path, n); 
		} 
	}//End of displayPaths()

	public void displayPaths()
	{
		int[] path = new int[MAX_SIZE];

		displayPaths(root, path, 0);
	}//End of displayPaths()	

}//End of class BinarySearchTree

class BinarySearchTreeDemo
{
	public static void main(String[] args)
    {
		BinarySearchTree bst = new BinarySearchTree();

		//Create the Binary Search Tree
		bst.insert(80);
		bst.insert(70);
		bst.insert(65);
		bst.insert(75);
		bst.insert(90);
		bst.insert(85);
		bst.insert(95);

		System.out.println("Binary Search Tree is :");
		bst.display();
		System.out.println();

		System.out.println("Root to leaf nodes paths :");
		bst.displayPaths();

    }//End of main()
}//End of class BinarySearchTreeDemo
