//Ex26.java : Write a method to check whether a binary tree is binary search tree or not.

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

	private void inorder(Node p)
	{
		if(p == null )//Base Case
			return;
		inorder(p.lchild);
		System.out.print(p.info + " ");
		inorder(p.rchild);
	}//End of inorder()

	public void inorder()
	{
		inorder(root);
	}//End of inorder()

	private boolean isBST(Node p, int MIN, int MAX)
	{ 
		if(p == null) 
			return true;

		if(p.info < MIN || p.info > MAX)
			return false;

		return (isBST(p.lchild,MIN,p.info) && isBST(p.rchild,p.info,MAX)); 
	}//End of isBST()

	public boolean isBST()
	{
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}//End of isBST()

}//End of class BinaryTree

class BinaryTreeDemo
{
	public static void main(String[] args)
    {
		BinaryTree bt1 = new BinaryTree();
		BinaryTree bt2 = new BinaryTree();

		//Create the Binary Tree
		bt1.root = new Node(32);
		bt1.root.lchild = new Node(23);
		bt1.root.rchild = new Node(36);
		bt1.root.lchild.rchild = new Node(25);
		bt1.root.rchild.lchild = new Node(33);

		System.out.println("Binary Tree 1 :");
		bt1.display();
		System.out.println();
		System.out.println("Inorder :");
		bt1.inorder();
		System.out.println();

		bt2.root = new Node(42);
		bt2.root.lchild = new Node(60);
		bt2.root.rchild = new Node(19);
		bt2.root.lchild.rchild = new Node(36);
		bt2.root.rchild.lchild = new Node(41);

		System.out.println("Binary Tree 2 :");
		bt2.display();
		System.out.println();
		System.out.println("Inorder :");
		bt2.inorder();
		System.out.println();
		
		if(bt1.isBST())  
			System.out.println("Binary Tree 1 is a BST");
		else
			System.out.println("Binary Tree 2 is not a BST");

		if(bt2.isBST())  
			System.out.println("Binary Tree 2 is a BST");
		else
			System.out.println("Binary Tree 2 is not a BST");

    }//End of main()
}//End of class BinaryTreeDemo
