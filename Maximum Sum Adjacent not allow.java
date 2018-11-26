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
class MaxSum_TwoLevel {
    static int sum1=0,sum2=0;
    Node root;
    void getMax(Node node)
    {
        if(node==null)
          return;
       Queue<Node> q1=new LinkedList<Node>();
       Queue<Node> q2=new LinkedList<Node>();
       q1.add(node);
       while(!q1.isEmpty()||!q2.isEmpty())
       {
           while(!q1.isEmpty())
           {
               Node u=q1.poll();
               sum1+=u.data;
               if(u.left!=null)
                 q2.add(u.left);
               if(u.right!=null)
                q2.add(u.right);
           }
           while(!q2.isEmpty())
           {
               Node u=q2.poll();
               sum2+=u.data;
               if(u.left!=null)
                 q1.add(u.left);
               if(u.right!=null)
                q1.add(u.right);
           }
       }
       if(sum1>sum2)
         System.out.println(sum1);
       else
       System.out.println(sum2);
        
    }
	public static void main (String[] args) {
		MaxSum_TwoLevel tree=new MaxSum_TwoLevel();
		tree.root=new Node(1);
		tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.right.left = new Node(4); 
        tree.root.right.left.right = new Node(5); 
        tree.root.right.left.right.left = new Node(6);
        tree.getMax(tree.root);
	}
}
