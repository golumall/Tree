//https://ide.geeksforgeeks.org/R8HGFqxg2x
//Sources
//https://www.geeksforgeeks.org/bottom-view-binary-tree/

import java.util.*;
class Node
{
    int data;
    int hd;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
        hd=Integer.MAX_VALUE;
    }
    
}
class Bottom_View_BT{
    Node root;
    void Bottom_View(Node node)
    {
        int hd=0;
        Queue<Node>q=new LinkedList<>();
        Map<Integer,Integer>mp=new TreeMap<>();
        node.hd=0;
        q.add(node);
        while(!q.isEmpty())
        {
           Node temp=q.poll();
           hd=temp.hd;
           mp.put(hd,temp.data);
           if(temp.left!=null)
           {
               temp.left.hd=hd-1;
               q.add(temp.left);
           }
           if(temp.right!=null)
           {
               temp.right.hd=hd+1;
               q.add(temp.right);
           }
           
        }
        for(Map.Entry<Integer,Integer>m:mp.entrySet())
        {
            System.out.print(m.getValue()+" ");
        }
    }
	public static void main (String[] args) {
		Bottom_View_BT tree=new Bottom_View_BT();
		tree.root=new Node(20);
		tree.root.left=new Node(8);
		tree.root.right=new Node(22);
		tree.root.left.left=new Node(5);
		tree.root.left.right=new Node(3);
		tree.root.right.left=new Node(4);
		tree.root.right.right=new Node(25);
		tree.root.left.right.left=new Node(10);
		tree.root.left.right.right=new Node(14);
		
		tree.Bottom_View(tree.root);
		
		
	}
}
