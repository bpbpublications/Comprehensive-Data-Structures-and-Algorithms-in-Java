//Ex20.java : Write a method to display all the ancestors of a node in a binary search tree.

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

	private void displayAncestors(Node p, int data)
	{
		if(p == null || p.info==data)
			return;

		if(data < p.info )
			displayAncestors(p.lchild, data);
		else
			displayAncestors(p.rchild, data);

		System.out.print(p.info + " ");
	}//End of displayAncestors()

	public void displayAncestors(int data)
	{
		displayAncestors(root,data);
	}//End of displayAncestors()

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

		int data = 65;
		System.out.println("Ancestors of " + data + " are :");
		bst.displayAncestors(data);
		System.out.println();

    }//End of main()
}//End of class BinarySearchTreeDemo
