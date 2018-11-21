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
class Print_Node_BetweenLevel{
    Node root;
    void printPath(Node node,int low,int high)
    {
        if(node==null)
          return;
        Queue<Node> q1=new LinkedList<Node>();
        Queue<Node> q2=new LinkedList<Node>();
        int i=1;
        q1.add(node);
        while(!q1.isEmpty()||!q2.isEmpty())
        {
            while(!q1.isEmpty())
            {
                Node u=q1.poll();
                if(i>=low&&i<=high)
                  System.out.print(u.data+" ");
                if(u.left!=null)
                  q2.add(u.left);
                if(u.right!=null)
                   q2.add(u.right);
            }
            i++;
            System.out.println();
             while(!q2.isEmpty())
            {
                Node u=q2.poll();
                if(i>=low&&i<=high)
                  System.out.print(u.data+" ");
                if(u.left!=null)
                  q1.add(u.left);
                if(u.right!=null)
                   q1.add(u.right);
            }
            i++;
            System.out.println();
            
            
        }
    }
	public static void main (String[] args) {
		Print_Node_BetweenLevel tree=new Print_Node_BetweenLevel();
		tree.root=new Node(20);
		tree.root.left=new Node(8);
		tree.root.right=new Node(22);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(12);
		tree.root.left.right.left=new Node(10);
		tree.root.left.right.right=new Node(14);
		tree.printPath(tree.root,2,4);
	}
}
