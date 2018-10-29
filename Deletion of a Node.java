
/*
1) Select Rightmost right node of tree
2)Search node whih want to delete
3)Replace last node to delete node
4)make last node as null
*/


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
class Delete_Node
{
	Node root;
	void delete(Node root,int key)
	{
		Queue<Node> q1=new LinkedList<Node>();
		Queue<Node> q2=new LinkedList<Node>();
		int last=0;
		q1.add(root);
		while(!q1.isEmpty())
		{
			Node u=q1.poll();
			if(u.right!=null)
				q1.add(u.right);
			last=u.data;
		}
		q1.add(root);
		while(!q1.isEmpty())
		{
			Node u=q1.poll();
			if(u.data==key)
			{
				u.data=last;
				break;
			}
			if(u.left!=null)
			  q1.add(u.left);
			if(u.right!=null)
              q1.add(u.right); 
		}
       q2.add(root);
       while(!q2.isEmpty())
       {
       	Node u=q2.poll();
       	if(u.right.right!=null&&u.right!=null)
       		q2.add(u.right);
       	else
       	{
       		u.right=null;
       		break;
       	}

       }
	}
	void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void main(String[] args) {
		Delete_Node tree=new Delete_Node();
		tree.root=new Node(10);
		tree.root.left=new Node(11);
		tree.root.left.left=new Node(7);
		tree.root.left.right=new Node(12);
		tree.root.right=new Node(9);
		tree.root.right.left=new Node(15);
		tree.root.right.right=new Node(8);

		tree.inOrder(tree.root);
		int key=11;
		tree.delete(tree.root,key);
		System.out.println();
		tree.inOrder(tree.root);
	}
}
