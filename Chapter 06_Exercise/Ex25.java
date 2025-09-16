//Ex25.java : Write a method to find whether two binary trees are mirror image of each other or not.

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

	private boolean isMirrorImage(Node p)
	{
		boolean flag;

		swapChildren(root);

		if(isIdentical(root, p))
			flag = true;
		else
			flag = false;

		swapChildren(root);

		return flag;
	}//End of isMirrorImage()

	public boolean isMirrorImage(BinaryTree bt)
	{
		return isMirrorImage(bt.root);
	}//End of isMirrorImage()

	private boolean isIdentical(Node p1, Node p2)
	{
		if(p1==null && p2==null)
			return true;

		if(p1!=null && p2!=null && p1.info == p2.info)
			if(isIdentical(p1.lchild, p2.lchild) && isIdentical(p1.rchild, p2.rchild))
				return true;

		return false;
	}//End of isIdentical()

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

}//End of class BinaryTree

class BinaryTreeDemo
{
	public static void main(String[] args)
    {
		BinaryTree bt1 = new BinaryTree();
		BinaryTree bt2 = new BinaryTree();
		BinaryTree bt3 = new BinaryTree();

		//Create the Binary Tree
		bt1.root = new Node(32);
		bt1.root.lchild = new Node(23);
		bt1.root.rchild = new Node(13);
		bt1.root.lchild.rchild = new Node(45);
		bt1.root.rchild.lchild = new Node(48);

		System.out.println("Binary Tree 1 :");
		bt1.display();
		System.out.println();

		bt2.root = new Node(42);
		bt2.root.lchild = new Node(60);
		bt2.root.rchild = new Node(19);
		bt2.root.lchild.rchild = new Node(36);
		bt2.root.rchild.lchild = new Node(41);

		System.out.println("Binary Tree 2 :");
		bt2.display();
		System.out.println();
		
		bt3.root = new Node(32);
		bt3.root.lchild = new Node(13);
		bt3.root.rchild = new Node(23);
		bt3.root.lchild.rchild = new Node(48);
		bt3.root.rchild.lchild = new Node(45);

		System.out.println("Binary Tree 3 :");
		bt3.display();
		System.out.println();

		if(bt1.isMirrorImage(bt2))
			System.out.println("Binary Tree 1 is mirror image of Binary Tree 2");
		else
			System.out.println("Binary Tree 1 is not mirror image of Binary Tree 2");

		if(bt1.isMirrorImage(bt3))
			System.out.println("Binary Tree 1 is mirror image of Binary Tree 3");
		else
			System.out.println("Binary Tree 1 is not mirror image of Binary Tree 3");

    }//End of main()
}//End of class BinaryTreeDemo




