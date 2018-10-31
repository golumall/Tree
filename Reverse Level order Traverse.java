import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
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
class Reverse_Level_Order
{
	Node root;
	void printTree(Node root)
	{
		if(root==null)
			return;
		Queue<Node> q=new LinkedList<Node>();
		Stack<Node> s=new Stack<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node u=q.poll();
			if(u.right!=null)
				q.add(u.right);
			if(u.left!=null)
				q.add(u.left);
			s.push(u);
		}
		while(!s.isEmpty())
		{
			System.out.print(s.pop().data+" ");
		}
	}
	public static void main(String[] args) {
		Reverse_Level_Order tree=new Reverse_Level_Order();
		tree.root=new Node(10);
		tree.root.left=new Node(20);
		tree.root.right=new Node(30);
		tree.root.left.left=new Node(40);
		tree.root.left.right=new Node(50);
		tree.root.right.left=new Node(60);
		tree.root.right.right=new Node(70);
		tree.printTree(tree.root);
	}
}
