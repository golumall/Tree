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
class Diagonal_Traverse
{
	Node root;
	void traverse(Node root)
	{
		if(root==null)
			return;
		Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
        	Node u=q.poll();
        	if(u==null)
        	{
        		if(q.isEmpty())
        			return;
              System.out.println();
              q.add(null);
        	}
        	else
        	{
        		while(u!=null)
        		{
        		System.out.print(u.data+" ");
        		if(u.left!=null)
        			q.add(u.left);
        		u=u.right;
        	}

        	}
        }
	}
	public static void main(String[] args) {
		Diagonal_Traverse tree=new Diagonal_Traverse();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		tree.traverse(tree.root);
	}
	
}
