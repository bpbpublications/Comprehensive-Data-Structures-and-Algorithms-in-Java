//Ex30.java : Write a method to traverse a binary tree in zigzag order.

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

	//Displays nodes on a level from left to right
	private void displayLevelLeftToRight(Node p, int level)
	{  
		if(p == null)  
			return;

		if(level == 0)  
			System.out.print(p.info + " ");

		displayLevelLeftToRight(p.lchild, level-1);
		displayLevelLeftToRight(p.rchild, level-1);
	}//End of displayLevelLeftToRight()

	//Displays nodes on a level from right to left
	private void displayLevelRightToLeft(Node p, int level)
	{  
		if(p == null)  
			return;

		if(level == 0)
			System.out.print(p.info + " ");

		displayLevelRightToLeft(p.rchild, level-1);
		displayLevelRightToLeft(p.lchild, level-1);
	}//End of displayLevelRightToLeft()

	private int height(Node p)
	{
		int hLeft, hRight;

		if(p == null)	//Base case
			return 0;

		hLeft = height(p.lchild);
		hRight = height(p.rchild);

		if(hLeft > hRight)
			return 1+hLeft;
		else
			return 1+hRight;
	}//End of height()

	public void zigzagOrder()  
	{  
		for(int i=0; i<height(root); i++)	
			if(i%2==0)
				displayLevelLeftToRight(root,i);
			else
				displayLevelRightToLeft(root,i);
	}//End of zigzagOrder()

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
		bst.insert(68);
		bst.insert(98);

		System.out.println("Binary Search Tree is :");
		bst.display();
		System.out.println();

		System.out.print("Display tree in zigzag order = ");
		bst.zigzagOrder();
		System.out.println();

    }//End of main()
}//End of class BinarySearchTreeDemo
