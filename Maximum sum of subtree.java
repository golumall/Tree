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
class MaxSum_SubTree {
    Node root;
   static int sum=Integer.MIN_VALUE,y;
    void getMax(Node node)
    {
        if(node==null)
          return ;
          
        y=getMaxUtil(node);
        if(y>sum)
           sum=y;
          
     getMax(node.left);
     getMax(node.right);
        
     
    }
    int getMaxUtil(Node node)
    {
        if(node==null)
          return 0;
         return node.data+getMaxUtil(node.left)+getMaxUtil(node.right); 
    }
 
	public static void main (String[] args) {
	    MaxSum_SubTree tree=new MaxSum_SubTree();
	    tree.root=new Node(1);
	    tree.root.left=new Node(2);
	    tree.root.right=new Node(3);
	    tree.root.left.left=new Node(4);
	    tree.root.left.right=new Node(5);
	    tree.root.right.left=new Node(6);
	    tree.root.right.right=new Node(7);
	   tree.root.left.left.left=new Node(-28);
	    tree.getMax(tree.root);
	    System.out.println(sum);
		
	}
}
