class Node
{
	String data;
	Node left,right;
	Node(String data)
	{
	this.data=data;
	left=right=null;
	}
}
class Evaluation_ExpressionTree
{
	Node root;
	int eval(Node node)
	{
		if(node==null)
			return 0;
		if(node.left==null&&node.right==null)
			return Integer.parseInt(node.data);
		int lValue=eval(node.left);
		int rValue=eval(node.right);
		if(node.data=="+")
			return lValue+rValue;
		if(node.data=="-")
			return lValue-rValue;
		if(node.data=="*")
			return lValue*rValue;
		return lValue/rValue;
	}
	public static void main(String[] args) {
		Evaluation_ExpressionTree tree=new Evaluation_ExpressionTree();
		tree.root=new Node("+");
		tree.root.left=new Node("*");
		tree.root.right=new Node("-");
		tree.root.left.left=new Node("5");
		tree.root.left.right=new Node("4");
		tree.root.right.left=new Node("100");
		tree.root.right.right=new Node("20");
		System.out.println(tree.eval(tree.root));
	}
	
}
