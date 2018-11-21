/*package whatever //do not write package name here */

import java.io.*;
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
class PrintCousin {
    Node root;
    int getLevel(Node node,int data,int level)
    {
        if(node==null)
          return 0;
        if(node.data==data)
           return level;
        int l=getLevel(node.left,data,level+1);
         if(l!=0)
           return l;
         l=getLevel(node.right,data,level+1);
         return l;
    }
    void printValue(Node node,int data)
    {
        Queue<Node> q1=new LinkedList<Node>();
        Queue<Node> q2=new LinkedList<Node>();
        q1.add(node);
        int i=1;
        int j=getLevel(node,data,1);
        while(!q1.isEmpty()||!q2.isEmpty())
        {
            while(!q1.isEmpty())
            {
                Node u=q1.poll();
                if(i==j)
                 System.out.print(u.data+" ");
                if(u.left!=null&&u.left.data!=data&&u.right.data!=data)
                  q2.add(u.left);
                if(u.right!=null&&u.right.data!=data&&u.left.data!=data)
                  q2.add(u.right);
                 
            }
            i++;
            while(!q2.isEmpty())
            {
                Node u=q2.poll();
                if(i==j)
                 System.out.print(u.data+" ");
                if(u.left!=null&&u.left.data!=data&&u.right.data!=data)
                  q1.add(u.left);
                if(u.right!=null&&u.right.data!=data&&u.left.data!=data)
                  q1.add(u.right);
                 
            }
            i++;
        }
    }
	public static void main (String[] args) {
		PrintCousin tree=new PrintCousin();
		tree.root=new Node(1);;
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		tree.printValue(tree.root,5);
	}
}
