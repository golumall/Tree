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
class Check_Perfect_Tree
{
	Node root;
	static int d=0,f=0;
	int depth(Node node)
	{
		int y=0;
		while(node!=null)
		{
			node=node.left;
			y++;
		} 
		return y;
	}
	boolean preOrder(Node node,int lev)
	{
		if(node==null)
			return true;
		if(node.left==null&&node.right==null)
			return (d==lev);
		if((node.left==null&&node.right!=null)||(node.left!=null&&node.right==null))
			return  false;
		return preOrder(node.left,lev+1)&&preOrder(node.right,lev+1);
		
	}
	boolean check(Node node)
	{

		d=depth(node);
		return preOrder(node,1);
	}

	public static void main(String[] args) {
		Check_Perfect_Tree tree=new Check_Perfect_Tree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		if(tree.check(tree.root))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
