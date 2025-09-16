//Ex24.java : Write a function to swap right and left children of a binary tree i.e. all right children become left children and 
//vice versa. The new tree is the mirror image of the original tree.

class Node
{
	public int info;
	public Node lchild;
	public Node rchild;

	public Node(int data)
	{
		info = data;
		lchild = null;
		rchild = null;
	}
}//End of class Node

class BinaryTree
{
	public Node root;

	public BinaryTree()
	{
		root = null;
	}//End of BinaryTree()

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
		System.out.println();
	}//End of display()	

	private void swapChildren(Node p)
	{ 
		Node temp;

		if (p==null) 
			return;

		swapChildren(p.lchild); 
		swapChildren(p.rchild);

	    temp = p.lchild; 
	    p.lchild = p.rchild; 
	    p.rchild = temp;
	}//End of swapChildren()	
	
	public void swapChildren()
	{
		swapChildren(root);
	}//End of swapChildren()	

}//End of class BinaryTree

class BinaryTreeDemo
{
	public static void main(String[] args)
    {
		BinaryTree bt = new BinaryTree();

		//Create the Binary Tree
		bt.root = new Node(32);
		bt.root.lchild = new Node(43);
		bt.root.rchild = new Node(25);
		bt.root.rchild.lchild = new Node(65);
		bt.root.rchild.rchild = new Node(14);
		bt.root.lchild.rchild = new Node(16);

		System.out.println("Binary Tree :");
		bt.display();
		System.out.println();

		bt.swapChildren();

		System.out.println("After swap right and left, Binary Tree :");
		bt.display();
		System.out.println();

    }//End of main()
}//End of class BinaryTreeDemo		