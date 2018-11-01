import java.util.Stack;
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
class Iterative_PostOrder_TwoStack
{
	Node root;
	void traverse(Node root)
	{
		if(root==null)
			return;
		Stack<Node> s1=new Stack<Node>();
		Stack<Node> s2=new Stack<Node>();
		s1.push(root);
		while(!s1.isEmpty())
		{
			Node u=s1.pop();
			s2.push(u);
			if(u.left!=null)
				s1.push(u.left);
			if(u.right!=null)
				s1.push(u.right);
		}
		while(!s2.isEmpty())
		{
			System.out.print(s2.pop().data+" ");
		}
	}
	public static void main(String[] args) {
		Iterative_PostOrder_TwoStack tree=new Iterative_PostOrder_TwoStack();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        tree.traverse(tree.root);
	}
}
