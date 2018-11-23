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
class Diagonal_Sum {
    Node root;
    int sum=0;
    void getSum(Node node)
    {
        if(node==null)
          return;
        Queue<Node> q=new LinkedList<Node>();
        q.add(node);
        q.add(null);
        while(!q.isEmpty())
        {
            Node u=q.poll();
            if(u==null)
            {
                
              
             System.out.println(sum);
             sum=0;
             if(q.isEmpty())
                  return;
            q.add(null);
            }
            else
            {
                while(u!=null)
                {
                    sum+=u.data;
                    if(u.left!=null)
                      q.add(u.left);
                    u=u.right;
                }
            }
        }
        
        
    }
	public static void main (String[] args) {
		Diagonal_Sum tree=new Diagonal_Sum();
		tree.root=new Node(1);
		tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(9); 
        tree.root.left.right = new Node(6); 
        tree.root.right.left = new Node(4); 
        tree.root.right.right = new Node(5); 
        tree.root.right.left.left = new Node(12); 
        tree.root.right.left.right = new Node(7); 
        tree.root.left.right.left = new Node(11); 
        tree.root.left.left.right = new Node(10);
        tree.getSum(tree.root);
	}
}
