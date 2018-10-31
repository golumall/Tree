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
class Level_Order_One_Queue
{
	Node root;
	void printTree(Node root)
	{
		if(root==null)
			return;
		Queue<Node> q1=new LinkedList<Node>();
		q1.add(root);
		q1.add(null);
		while(!q1.isEmpty())
		{
			
				Node u=q1.poll();
				if(u==null)
				{
                  if(!q1.isEmpty())
                  	q1.add(null);
				System.out.println();
			}
			else
			{
				if(u.left!=null)
					q1.add(u.left);
				if(u.right!=null)
					q1.add(u.right);
				System.out.print(u.data+" ");
			}
			
		}

	}
	public static void main(String[] args) {
		Level_Order_One_Queue tree=new Level_Order_One_Queue();
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
