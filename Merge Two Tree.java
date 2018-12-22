/*package whatever //do not write package name here */

import java.io.*;
class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class Merge_Two_Tree {
    Node root1,root2;
    void inOrder(Node node)
    {
        if(node==null)
           return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
        
    }
    Node merge(Node t1,Node t2)
    {
        if(t1==null)
           return t2;
        if(t2==null)
           return t1;
         t1.data+=t2.data;
         t1.left=merge(t1.left,t2.left);
         t1.right=merge(t1.right,t2.right);
          return t1;
    }
	public static void main (String[] args) {
		 Merge_Two_Tree tree=new Merge_Two_Tree();
		 tree.root1=new Node(1);
		 tree.root1.left=new Node(2);
		 tree.root1.right=new Node(3);
		 tree.root1.left.left=new Node(4);
		 tree.root1.left.right=new Node(5);
		 tree.root1.right.right=new Node(6);
		 
		 tree.root2=new Node(4);
		 tree.root2.left=new Node(1);
		 tree.root2.right=new Node(7);
		 tree.root2.left.left=new Node(3);
		 tree.root2.right.left=new Node(2);
		 tree.root2.right.right=new Node(6);
		 
		tree.inOrder(tree.merge(tree.root1,tree.root2));
	}
}
