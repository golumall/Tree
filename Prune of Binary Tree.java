// Sources
//https://leetcode.com/articles/binary-tree-pruning/

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
class PruneTree {
    Node root;
      Node prune(Node root)
      {
          if(root==null)
            return null;
            root.left=prune(root.left);
            root.right=prune(root.right);
        if(root.data==0&&root.left==null&&root.right==null)
           root=null;
         return root;  
      }
      void inOrder(Node node)
      {
          if(node==null)
            return;
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
      }
      void printTree(Node node)
      {
         System.out.println("Before Prune");
           inOrder(node);
           
         System.out.println("\nAfter Prune");
            inOrder(prune(node));
           
      }
	public static void main (String[] args) {
	    PruneTree tree=new PruneTree();
	    tree.root=new Node(1);
	    tree.root.left=new Node(0);
	    tree.root.right=new Node(1);
	    tree.root.left.left=new Node(0);
	    tree.root.left.right=new Node(0);
	    tree.root.right.left=new Node(0);
	    tree.root.right.right=new Node(1);
	 tree.printTree(tree.root);
	}
}
