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
class Reverse_Level_Order_Recursion
{
	Node root;
	void reverse(Node root)
	{
		int h=height(root);
		int i;
		for(i=h;i>=1;i--)
		{
			reverseUtil(root,i);
		}
	}
	void reverseUtil(Node root,int l)
	{
		if(root==null)
			return;
		if(l==1)
			System.out.print(root.data+" ");
		else if(l>1)
		{
			reverseUtil(root.left,l-1);
			reverseUtil(root.right,l-1);
		}
	}
	int height(Node root)
	{
		if(root==null)
			return 0;
		int lheight=height(root.left);
		int rheight=height(root.right);
		if(lheight>rheight)
			return (lheight+1);
		return (rheight+1);
	}
	public static void main(String[] args) {
		Reverse_Level_Order_Recursion tree=new Reverse_Level_Order_Recursion();
		tree.root=new Node(10);
		tree.root.left=new Node(20);
		tree.root.right=new Node(30);
		tree.root.left.left=new Node(40);
		tree.root.left.right=new Node(50);
		tree.root.right.left=new Node(60);
		tree.root.right.right=new Node(70);
		tree.reverse(tree.root);

	}

}
