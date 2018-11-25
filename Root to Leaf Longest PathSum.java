/*package whatever //do not write package name here */

import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class MaxSum_MaxLength {
    Node root;
   static int maxLength=Integer.MIN_VALUE,sum=Integer.MIN_VALUE;
    void  rootLeaf(Node node)
    {
        int path[]=new int[1000];
        rootLeafUtil(node,path,0);
    }
    void rootLeafUtil(Node node,int path[],int len)
    {
        if(node==null)
        return;
        path[len]=node.data;
        len++;
        if(node.left==null&&node.right==null)
          getSum(path,len);
        rootLeafUtil(node.left,path,len+1);
        rootLeafUtil(node.right,path,len+1);
    }
    void getSum(int path[],int len)
    {
        int x=0;
        for(int i=0;i<len;i++)
           x+=path[i];
        if(len>maxLength)
          {
              maxLength=len;
              sum=x;
          }
          else if(len==maxLength&&x>sum)
           sum=x;
          
    }
	public static void main (String[] args) {
		MaxSum_MaxLength tree=new MaxSum_MaxLength();
	tree.root = new Node(4);         /*        4        */
        tree.root.left = new Node(2);         /*       / \       */
        tree.root.right = new Node(5);        /*      2   5      */
        tree.root.left.left = new Node(7);    /*     / \ / \     */
        tree.root.left.right = new Node(1);   /*    7  1 2  3    */
        tree.root.right.left = new Node(2);   /*      /          */
        tree.root.right.right = new Node(3);  /*     6           */
        tree.root.left.right.left = new Node(6);
        tree.rootLeaf(tree.root);
        System.out.println(sum);
	}
}
