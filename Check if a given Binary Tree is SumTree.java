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
class Check_BT_SumTree
{
	Node root;
   int sum=0,x=0;
	boolean inOrder(Node root)
	{
		if(root==null)
			return true;
		if(root.data!=inOrder1(root))
          	return false;
          sum=0;
          x=0;
		inOrder(root.left);
          
        inOrder(root.right);
        return true;
	}
	int inOrder1(Node node)
	{
		if(node==null)
			return 0;
		if(x!=0)
		  sum+=node.data;
		x++;
		inOrder1(node.left);
		
		inOrder1(node.right);
		return sum;

	}
	public static void main(String[] args) {
		
	Check_BT_SumTree tree=new Check_BT_SumTree();
	tree.root=new Node(26);
	tree.root.left=new Node(10);
	tree.root.right=new Node(3);
	tree.root.left.left=new Node(4);
	tree.root.left.right=new Node(6);
	tree.root.right.right=new Node(3);
	if(tree.inOrder(tree.root))
	   System.out.println("YES");
	else
		System.out.println("NO");

	}
}
