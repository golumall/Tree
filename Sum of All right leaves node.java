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
    void sumNode(Node node)
    {
        if(node==null)
          return;
          if(node.right!=null&&node.right.left==null&&node.right.right==null)
          {
           sum+=node.right.data;
          }
        sumNode(node.left);
        sumNode(node.right);
    }
	public static void main (String[] args) {
		Sum_ParentNode_ValueX tree=new Sum_ParentNode_ValueX();
	tree.root =new Node(1);  
    tree.root.left =new Node(2);  
    tree.root.left.left =new Node(4);  
    tree.root.left.right =new Node(5);  
    tree.root.left.left.right =new Node(2);  
    tree.root.right =new Node(3);  
    tree.root.right.right =new Node(8);  
    tree.root.right.right.left =new Node(6);  
    tree.root.right.right.right =new Node(7);  
    tree.sumNode(tree.root);
		System.out.println(sum);
	}
}
