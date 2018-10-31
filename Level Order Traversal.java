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
class Level_Order
{
	Node root;
	void printTree(Node root)
	{
		if(root==null)
			return;
		Queue<Node> q1=new LinkedList<Node>();
		Queue<Node> q2=new LinkedList<Node>();
		q1.add(root);
		while(!q1.isEmpty()||!q2.isEmpty())
		{
			while(!q1.isEmpty())
			{
				Node u=q1.poll();
				System.out.print(u.data+" ");
				if(u.left!=null)
					q2.add(u.left);
				if(u.right!=null)
					q2.add(u.right);
			}
			while(!q2.isEmpty())
			{
				Node u=q2.poll();
				System.out.print(u.data+" ");
				if(u.left!=null)
					q1.add(u.left);
				if(u.right!=null)
					q1.add(u.right);
			}
		}

	}
	public static void main(String[] args) {
		Level_Order tree=new Level_Order();
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
