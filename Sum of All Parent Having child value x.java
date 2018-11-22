/*package whatever //do not write package name here */

import java.io.*;
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
class Sum_ParentNode_ValueX {
    Node root;
    static int sum=0;
    void sumNode(Node node,int x)
    {
        if(node==null)
          return;
          if(node.left!=null&&node.right!=null)
          {
        if(node.left.data==x||node.right.data==x)
          sum+=node.data;
          }
        sumNode(node.left,x);
        sumNode(node.right,x);
    }
	public static void main (String[] args) {
		Sum_ParentNode_ValueX tree=new Sum_ParentNode_ValueX();
		tree.root=new Node(4);
		tree.root.left=new Node(2);
		tree.root.right=new Node(5);
		tree.root.left.left=new Node(7);
		tree.root.left.right=new Node(2);
		tree.root.right.left=new Node(2);
		tree.root.right.right=new Node(8);
		tree.sumNode(tree.root,2);
		System.out.println(sum);
	}
}
