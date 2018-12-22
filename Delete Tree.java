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
class Delete_Tree {
    Node root;
    void inOrder(Node node)
    {
        if(node==null)
          return;
        inOrder(node.left);
    System.out.print(node.data+" ");
        inOrder(node.right);
    }
    void deleteTree(Node node)
    {
        if(root==null)
          return;
        deleteTree(node.left);
        deleteTree(node.right);
        node=null;
    }
	public static void main (String[] args) {
		Delete_Tree tree=new Delete_Tree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		System.out.println("Befor");
		tree.inOrder(tree.root);
		System.out.println("\nAfter");
		tree.deleteTree(tree.root);
		tree.inOrder(tree.root);
	}
}
