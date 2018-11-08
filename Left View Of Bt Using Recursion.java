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
class LeftView_Using_Recursion
{
	Node root;
	static int max=0;
	void getLeft(Node root,int level)
	{
		if(root==null)
			return;
		if(max<level)
		{
			System.out.print(root.data+" ");
			max=level;
		}
		getLeft(root.left,level+1);
		getLeft(root.right,level+1);


	} 
	public static void main(String[] args) {
		LeftView_Using_Recursion tree=new LeftView_Using_Recursion();
		tree.root=new Node(4);
		tree.root.left=new Node(5);
		tree.root.right=new Node(2);
		tree.root.right.left=new Node(3);
		tree.root.right.right=new Node(1);
		tree.root.right.left.left=new Node(6);
		tree.root.right.left.right=new Node(7);
		tree.getLeft(tree.root,1);
	}

}
