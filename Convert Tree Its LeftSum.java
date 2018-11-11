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
class Convert_Tree_Its_LeftSum
{
	Node root;
	int treeConversion(Node node)
	{
		if(node==null)
			return 0;
		if(node.left==null&&node.right==null)
		    return node.data;
		int leftSum=treeConversion(node.left);
		int rightSum=treeConversion(node.right);
		node.data+=leftSum;
		return  node.data+rightSum;
	}
	void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void main(String[] args) {
		Convert_Tree_Its_LeftSum tree=new Convert_Tree_Its_LeftSum();
		tree.root=new Node(10);
		tree.root.left=new Node(-2);
		tree.root.right=new Node(6);
		tree.root.left.left=new Node(8);
		tree.root.left.right=new Node(-4);
		tree.root.right.left=new Node(7);
		tree.root.right.right=new Node(5);
		tree.inOrder(tree.root);
		tree.treeConversion(tree.root);
		System.out.println();
		tree.inOrder(tree.root);

	}
}
