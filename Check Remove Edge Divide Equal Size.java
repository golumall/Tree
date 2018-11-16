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
class Check_Remove_Edge_Divide_Equal_Size
{
	Node root;
	 int tot=0,f=0;
	int countNode(Node node)
	{
		if(node==null)
			return 0;
		return countNode(node.left)+countNode(node.right)+1;
	}
	void preOrder(Node node)
	{
		if(node==null)
			return;
		if((tot-countNode(node))==countNode(node))
			f=1;
		preOrder(node.left);
		preOrder(node.right);

	}
	boolean check(Node node)
	{

		tot=countNode(node);
		preOrder(node);
		if(f==1)
			return true;
		return false;
	}
public static void main(String[] args) {
	Check_Remove_Edge_Divide_Equal_Size tree=new Check_Remove_Edge_Divide_Equal_Size();
	tree.root = new Node(5); 
        tree.root.left = new Node(1); 
        tree.root.right = new Node(6); 
        tree.root.left.left = new Node(3); 
        tree.root.right.left = new Node(7); 
        tree.root.right.right = new Node(4); 
	if(tree.check(tree.root))
		System.out.println("YES");
	else
		System.out.println("NO");
}

}
