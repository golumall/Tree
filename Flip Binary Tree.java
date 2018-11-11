
//Sources
//https://www.geeksforgeeks.org/flip-binary-tree/

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
class Flip_BinaryTree
{
	Node root;
	Node flipped(Node node)
	{
		if(node==null)
			return node;
		if(node.left==null&&node.right==null)
			return node;
		Node flip=flipped(node.left);
       node.left.left=node.right;
       node.left.right=node;
       node.left=node.right=null;
       return flip;
	}
	void levelOrder(Node node)
	{
		if(node==null)
			return;
		Queue<Node> q1=new LinkedList<Node>();
		//Queue<Node> q2=new LinkedList<Node>();
        q1.add(node);
        while(!q1.isEmpty())
        {
        		Node u=q1.poll();
        		System.out.print(u.data+" ");
        		if(u.left!=null)
        			q1.add(u.left);
        		if(u.right!=null)
        			q1.add(u.right);
        	
        }
	}
	public static void main(String[] args) {
		Flip_BinaryTree tree=new Flip_BinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		tree.levelOrder(tree.root);
		System.out.println();
		tree.levelOrder(tree.flipped(tree.root));
	}
	
}
