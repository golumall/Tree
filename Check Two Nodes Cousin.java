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
class Check_Two_Nodes_Cousin
{
	Node root;
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
	boolean isSibling(Node node,Node a,Node b)
	{
		if(node==null)
			return false;
		return ((node.left==a&&node.right==b)||(node.right==a&&node.left==b)||isSibling(node.left,a,b)||isSibling(node.right,a,b));
	}
	boolean checkCousin(Node node,Node a,Node b)
	{
		if(node==null)
			return false;
		return (level(node,a,1)==level(node,b,1)&&isSibling(node,a,b)==false);
	}
	public static void main(String[] args) {
		Check_Two_Nodes_Cousin tree=new Check_Two_Nodes_Cousin();
		tree.root=new Node(6);
		tree.root.left=new Node(3);
		tree.root.right=new Node(5);
		tree.root.left.left=new Node(7);
		tree.root.left.right=new Node(8);
		tree.root.right.left=new Node(1);
		tree.root.right.right=new Node(3);
		Node node1=tree.root.left.left;
		Node node2=tree.root;
		if(tree.checkCousin(tree.root,node1,node2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
