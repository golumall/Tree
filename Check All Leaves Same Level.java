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
class Check_All_Leaves_Same_Level
{
	Node root;
	static int leafLevel=0,f=0;
	int level(Node node,Node a,int lev)
	{
		if(node==null)
			return 0;
		if(node==a)
			return lev;
		int l=level(node.left,a,lev+1);
		if(l!=0)
			return l;
		return level(node.right,a,lev+1);
	}
	void preOrder(Node node)
	{
		if(node==null)
			return;
		if(node.left==null&&node.right==null)
		{
		if(leafLevel!=level(root,node,1))
			f=1;
	    }
	preOrder(node.left);
	preOrder(node.right);
	}
	boolean check()
	{
		if(f==1)
			return false;
		return true;
	}
	public static void main(String[] args) {
		Check_All_Leaves_Same_Level tree=new Check_All_Leaves_Same_Level();
		tree.root=new Node(12);
		tree.root.left=new Node(1);
		tree.root.right=new Node(2);
		//tree.root.left.left=new Node(3);
		tree.root.right.right=new Node(4);
        leafLevel=tree.level(tree.root,tree.root.right.right,1);
        tree.preOrder(tree.root);
		if(tree.check())
			System.out.println("YES");
		else
			System.out.println("NO");
	}


}
