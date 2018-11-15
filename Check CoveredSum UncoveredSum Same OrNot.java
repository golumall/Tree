class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
	this.data=data;
	left=right=null;
	}
}
class Check_CoveredSum_UncoveredSum_Same_OrNot
{
	Node root;
	int sum(Node node)
	{
		if(node==null)
			return 0;
		return node.data+sum(node.left)+sum(node.right);
	}
	int leftSum(Node node)
	{
		if(node.left==null&&node.right==null)
			return node.data;
		if(node.left!=null)
			return node.data+leftSum(node.left);
		else
			return node.data+leftSum(node.right);
	}
	int rightSum(Node node)
	{
		if(node.left==null&&node.right==null)
			return node.data;
		if(node.right!=null)
			return node.data+rightSum(node.right);
		else
			return node.data+rightSum(node.left);
	}
	int unCovered(Node node)
	{
		int l=0,r=0;
		if(node.left!=null)
			l=leftSum(node.left);
		if(node.right!=null)
			r=rightSum(node.right);
		return node.data+l+r;
	}
	int covered(Node node)
	{
		return sum(node)-unCovered(node);
	}
	boolean check(Node node)
	{
		if(unCovered(node)==covered(node))
			return true;
		
		return false;

	}
	public static void main(String[] args) {
		Check_CoveredSum_UncoveredSum_Same_OrNot tree=new Check_CoveredSum_UncoveredSum_Same_OrNot();
		/*tree.root = new Node(8); 
        tree.root.left = new Node(3); 
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(6); 
        tree.root.left.right.left = new Node(4); 
        tree.root.left.right.right = new Node(7); 
  
        tree.root.right = new Node(10); 
        tree.root.right.right = new Node(14); 
        tree.root.right.right.left = new Node(13); */
        tree.root=new Node(9);
        tree.root.left=new Node(4);
        tree.root.right=new Node(5);
        tree.root.left.left=new Node(6);
        tree.root.left.right=new Node(7);
        tree.root.right.left=new Node(18);
        tree.root.right.right=new Node(1);
        if(tree.check(tree.root))
        	System.out.println("YES");
        else
        	System.out.println("NO");

	}
}
