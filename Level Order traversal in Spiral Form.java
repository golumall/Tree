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
class Level_Order_Spiral
{
	Node root;
	void printTree(Node root)
	{
		if(root==null)
			return;
	   Queue<Node> q=new LinkedList<Node>();
	   Stack<Node> s=new Stack<Node>();
	   s.push(root);
	   while(!s.isEmpty()||!q.isEmpty())
	   {
	   	while(!s.isEmpty())
	   	{
	   		Node u=s.pop();
	   		System.out.print(u.data+" ");
	   		if(u.left!=null)
	   			q.add(u.left);
	   		if(u.right!=null)
	   			q.add(u.right);
	   	}
	   	while(!q.isEmpty())
	   	{
	   		Node u=q.poll();
	   		System.out.print(u.data+" ");
	   		if(u.left!=null)
	   			s.push(u.left);
	   		if(u.right!=null)
	   			s.push(u.right);
	   	}
	   }
	}
	public static void main(String[] args) {
		Level_Order_Spiral tree=new Level_Order_Spiral();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		tree.printTree(tree.root);
		
	}
}
