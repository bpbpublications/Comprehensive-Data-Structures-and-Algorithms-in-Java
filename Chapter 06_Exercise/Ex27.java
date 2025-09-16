//Ex27.java : Write a recursive method that inputs a level number of a binary tree and returns the number of nodes at that level.

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
	
	private int nodesAtLevel(Node p, int level) 
	{
		if(p==null)
			return 0;

		if(level==0) 
			return 1;

		return nodesAtLevel(p.lchild,level-1) + nodesAtLevel(p.rchild,level-1);
	}//End of nodesAtLevel()

	public int nodesAtLevel(int level)
	{
		return nodesAtLevel(root, level);
	}//End of nodesAtLevel()

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

		int level = 2;
		System.out.println("Number of nodes at level " + level + " = " + bst.nodesAtLevel(level));
		System.out.println();

    }//End of main()
}//End of class BinarySearchTreeDemo
