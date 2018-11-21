/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;
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
class Print_Root_Node {
    Node root;
    void printPath(Node node,int k)
    {
        int path[]=new int[1000];
        printPathUtil(node,path,0,k);
    }
    void printPathUtil(Node node,int path[],int len,int k)
    {
        if(node==null)
        return;
        path[len]=node.data;
        len++;
        if(node.data==k)
          printArry(path,len);
        else
        {
            printPathUtil(node.left,path,len,k);
            printPathUtil(node.right,path,len,k);
        }
        
    }
    void printArry(int path[],int len)
    {
        System.out.println();
        for(int i=0;i<len;i++)
          System.out.print(path[i]+" ");
    }
	public static void main (String[] args) {
	    Print_Root_Node  tree=new Print_Root_Node();
	    Scanner sc=new Scanner(System.in);
	    tree.root=new Node(1);
	    tree.root.left=new Node(2);
	    tree.root.right=new Node(3);
	    tree.root.left.left=new Node(4);
	    tree.root.left.right=new Node(5);
	    int n=sc.nextInt();
	    tree.printPath(tree.root,n);
	    
	
	}
}
