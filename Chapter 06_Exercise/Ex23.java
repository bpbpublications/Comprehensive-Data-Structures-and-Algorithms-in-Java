//Ex23.java : Write a method to check whether two binary trees are identical or not. Two binary trees are identical or copies if 
//structure as well as data is same.

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
	
	private boolean isIdentical(Node p1, Node p2)
	{
		if(p1==null && p2==null)
			return true;

		if(p1!=null && p2!=null && p1.info == p2.info)
			if(isIdentical(p1.lchild, p2.lchild) && isIdentical(p1.rchild, p2.rchild))
				return true;

		return false;
	}//End of isIdentical()

	public boolean isIdentical(BinarySearchTree bst)
	{
		return isIdentical(root, bst.root);
	}//End of isIdentical()

}//End of class BinarySearchTree

class BinarySearchTreeDemo
{
	public static void main(String[] args)
    {
		BinarySearchTree bst1 = new BinarySearchTree();
		BinarySearchTree bst2 = new BinarySearchTree();
		BinarySearchTree bst3 = new BinarySearchTree();

		//Create the Binary Search Tree
		bst1.insert(6);
		bst1.insert(3);
		bst1.insert(8);
		bst1.insert(7);
		bst1.insert(1);
		bst1.insert(4);

		bst2.insert(16);
		bst2.insert(13);
		bst2.insert(18);
		bst2.insert(17);
		bst2.insert(11);
		bst2.insert(14);

		bst3.insert(16);
		bst3.insert(13);
		bst3.insert(18);
		bst3.insert(17);
		bst3.insert(11);
		bst3.insert(14);

		System.out.println("Binary Search Tree 1 :");
		bst1.display();
		System.out.println();

		System.out.println("Binary Search Tree 2 :");
		bst2.display();
		System.out.println();

		System.out.println("Binary Search Tree 3 :");
		bst3.display();
		System.out.println();

		if(bst1.isIdentical(bst2))
			System.out.println("Tree 1 and 2 are identical");
		else
			System.out.println("Tree 1 and 2 are not identical");

		if(bst2.isIdentical(bst3))
			System.out.println("Tree 2 and 3 are identical");
		else
			System.out.println("Tree 2 and 3 are not identical");

    }//End of main()
}//End of class BinarySearchTreeDemo
