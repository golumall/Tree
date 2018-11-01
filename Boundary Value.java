class Node
{
	int data;
	Node left,right;
	Node(int data)
	{
	this.data=data;
	left=right=null;
	}
}
class Boundary_Values
{
	Node root;
	void printLeave(Node node)
	{
		if(node!=null)
		{
			printLeave(node.left);
			if(node.left==null&&node.right==null)
				System.out.print(node.data+" ");
			printLeave(node.right);
		}
	}
	void printLeft(Node node)
	{
       if(node!=null)
       {
       	if(node.left!=null)
       	{
       		System.out.print(node.data+" ");
       		printLeft(node.left);
       	}
      	else if(node.right!=null)
       	{
       		System.out.print(node.data+" ");
       		printLeft(node.right);
       	}
       }
	}
	void printRight(Node node)
	{
        if(node!=null)
        {
        	if(node.right!=null)
        	{
        		printRight(node.right);
        		System.out.print(node.data+" ");
        	}
        	else if(node.left!=null)
        	{
        		printRight(node.left);
        		System.out.print(node.data+" ");
        	}
        }
	}
	void printBoundary(Node node)
	{
		if(node!=null)
		{
			System.out.print(node.data+" ");
			printLeft(node.left);
			printLeave(node.left);
			printLeave(root.right);
			printRight(node.right);
		}
	}
public static void main(String[] args) {
	Boundary_Values tree=new Boundary_Values();
	tree.root=new Node(20);
	tree.root.left=new Node(8);
	tree.root.right=new Node(22);
	tree.root.left.left=new Node(4);
	tree.root.left.right=new Node(12);
	tree.root.left.right.left=new Node(10);
	tree.root.left.right.right=new Node(14);
	tree.root.right.right=new Node(25);
   tree.printBoundary(tree.root);

}
	
}
