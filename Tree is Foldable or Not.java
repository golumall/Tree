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
class Foldable_Tree
{
	Node root;
	boolean isFoldable(Node node)
	{
		boolean res;
		if(node==null)
			return true;
		mirror(node.left);//mirror of left subtree
      res=isStructureSame(node.left,node.right);
      mirror(node.left);//get back to original tree
      return res; 
	}
	void mirror(Node node)
	{
		Node temp;
		if(node==null)
			return;
        mirror(node.left);
        mirror(node.right);
        temp=node.left;
        node.left=node.right;
        node.right=temp;
	}
	boolean isStructureSame(Node a,Node b)
	{
		if(a==null&&b==null)
			return true;
		if(a!=null&&b!=null&&isStructureSame(a.left,b.left)&&isStructureSame(a.right,b.right))
			return true;
		return false;
	}
	public static void main(String[] args) {
		Foldable_Tree tree=new Foldable_Tree();
		tree.root=new Node(10);
		tree.root.left=new Node(7);
		tree.root.right=new Node(15);
		tree.root.left.right=new Node(9);
		tree.root.right.left=new Node(11);
		tree.root.right.right=new Node(18);
		if(tree.isFoldable(tree.root))
			System.out.println("Foldable Tree");
		else
			System.out.println("Not Foldable Tree");
	}
	
}
