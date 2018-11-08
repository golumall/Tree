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
class LeftView_Of_Bt
{
	Node root;
	void getView(Node root)
	{
		if(root==null)
			return;
		Queue<Node> q1=new LinkedList<Node>();
		Queue<Node> q2=new LinkedList<Node>();
		q1.add(root);
		while(!q1.isEmpty()||!q2.isEmpty())
		{
			if(q1.peek()!=null)
				System.out.print(q1.peek().data+" ");
			while(!q1.isEmpty())
			{
				Node u=q1.poll();
				if(u.left!=null)
					q2.add(u.left);
				if(u.right!=null)
					q2.add(u.right);
			}
			if(q2.peek()!=null)
				System.out.print(q2.peek().data+" ");
			while(!q2.isEmpty())
			{
				Node u=q2.poll();
				if(u.left!=null)
					q1.add(u.left);
				if(u.right!=null)
					q1.add(u.right);
			}
		
		}


	}
	public static void main(String[] args) {
		
		LeftView_Of_Bt tree=new LeftView_Of_Bt();
		tree.root=new Node(4);
		tree.root.left=new Node(5);
		tree.root.right=new Node(2);
		tree.root.right.left=new Node(3);
		tree.root.right.right=new Node(1);
		tree.root.right.left.left=new Node(6);
		tree.root.right.left.right=new Node(7);
		tree.getView(tree.root);
	}

}
