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
class Print_All_Node_K_Distance_From_Leaf {
    Node root;
    void printNode(Node node,int k)
    {
        int path[]=new int[1000];
        boolean visited[]=new boolean[1000];
        printNodeUtil(node,path,visited,0,k);
    }
    void printNodeUtil(Node node,int path[],boolean visited[],int len,int k)
    {
        if(node==null)
        return;
        path[len]=node.data;
        visited[len]=false;
        len++;
        if(node.left==null&&node.right==null&&len-k-1>=0&&visited[len-k-1]==false)
        {
            System.out.println(path[len-k-1]);
            visited[len-k-1]=true;
        }
        printNodeUtil(node.left,path,visited,len,k);
        printNodeUtil(node.right,path,visited,len,k);
    }
	public static void main (String[] args) {
	    Print_All_Node_K_Distance_From_Leaf tree=new Print_All_Node_K_Distance_From_Leaf();
		tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
        tree.root.right.left.right = new Node(8); 
   
		tree.printNode(tree.root,2);
	}
}
