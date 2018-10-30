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
class Symmetric_Tree
{
	Node root;
	boolean isMirror(Node node1,Node node2)
	{
		if(node1==null&&node2==null)
			return true;
		if(node1!=null&&node2!=null&&node1.data==node2.data)
			return 	isMirror(node1.left,node2.right)&&isMirror(node1.right,node2.left);
		return false;
	}
	boolean symmetric(Node root)
	{
		if(root==null)
			return true;
		return isMirror(root,root);
	}
	public static void main(String[] args) {
		Symmetric_Tree tree=new Symmetric_Tree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(2);
		tree.root.left.left=new Node(3);
		tree.root.left.right=new Node(4);
		tree.root.right.left=new Node(4);
		tree.root.right.right=new Node(3);
		if(tree.symmetric(tree.root))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
}
