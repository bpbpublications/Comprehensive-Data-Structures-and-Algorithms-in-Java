//EX36.java : Write a method to check whether a BST is AVL tree or not.

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

	public boolean isAVL(Node p)  
	{
		int heightLeft, heightRight, diff;

		if(p == null)  
			return true;

		heightLeft = height(p.lchild);
		heightRight = height(p.rchild);  
		diff = heightLeft > heightRight ? heightLeft-heightRight : heightRight-heightLeft;

		if(diff<=1 &&  isAVL(p.lchild) && isAVL(p.rchild))  
			return true;

		return false;
	}//End of isAVL()

	public boolean isAVL()
	{
		return isAVL(root);
	}//End of isAVL()

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

		if(bst.isAVL())
			System.out.println("BST is an AVL tree");
		else
			System.out.println("BST is not an AVL tree");

    }//End of main()
}//End of class BinarySearchTreeDemo
