//Ex18.java : Write a method that returns the total number of leaf nodes in a binary tree and displays the info part of each leaf node.

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
	
	private void leafNodes(Node p)
	{  
		if(p == null)  
			return;

		if(p.lchild == null && p.rchild==null)  
		{
			System.out.print(p.info + " ");	
		}
		else
		{
			leafNodes(p.lchild);
			leafNodes(p.rchild);
		}
	}//End of leafNodes()

	public void leafNodes()  
	{
		leafNodes(root);
	}//End of leafNodes()	
	
	private int countLeafNodes(Node p)
	{  
		if(p == null)  
			return 0;

		if(p.lchild == null && p.rchild==null)  
			return 1;  
		else 
			return countLeafNodes(p.lchild) +  countLeafNodes(p.rchild);  
	}//End of countLeafNodes()

	public int countLeafNodes()  
	{
		return countLeafNodes(root);
	}//End of countLeafNodes()	

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

		System.out.println("Leaf nodes are :");
		bst.leafNodes();
		System.out.println();

		System.out.println("Total number of leaf nodes = " + bst.countLeafNodes());
		System.out.println();

    }//End of main()
}//End of class BinarySearchTreeDemo






