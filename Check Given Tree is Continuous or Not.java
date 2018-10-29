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
class Continuous_Tree
{
	Node root;
	boolean continueTree(Node root)
	{
		if(root==null||(root.left==null&&root.right==null))
			return true;
		if(root.left==null)
			return (Math.abs(root.data-root.right.data)==1)&&continueTree(root.right);
		if(root.right==null)
			return (Math.abs(root.data-root.left.data)==1)&&continueTree(root.left);
		return (Math.abs(root.data-root.right.data)==1)&&continueTree(root.right)&&(Math.abs(root.data-root.left.data)==1)&&continueTree(root.left);
		
	}
	public static void main(String[] args) {
		Continuous_Tree tree=new Continuous_Tree();
		tree.root=new Node(3);
		tree.root.left=new Node(2);
		tree.root.right=new Node(4);
		tree.root.left.left=new Node(1);
		tree.root.left.right=new Node(9);
		tree.root.right.right=new Node(5);
		if(tree.continueTree(tree.root))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
}
