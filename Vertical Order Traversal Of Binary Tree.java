//https://ide.geeksforgeeks.org/2XR50XxXA6
//Sources
//https://www.geeksforgeeks.org/print-a-binary-tree-in-vertical-order-set-3-using-level-order-traversal/


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
        Map<Integer,ArrayList<Integer>>mp=new TreeMap<>();
        node.hd=0;
        q.add(node);
        while(!q.isEmpty())
        {
           Node temp=q.poll();
           hd=temp.hd;
           if(mp.containsKey(hd))
             {
                 ArrayList<Integer>al=mp.get(hd);
                 al.add(temp.data);
                 mp.put(hd,al);
             }
             else
             {
                 ArrayList<Integer>al=new ArrayList<>();
                 al.add(temp.data);
                 mp.put(hd,al);
             }
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
        for(Map.Entry<Integer,ArrayList<Integer>>m:mp.entrySet())
        {
            ArrayList<Integer>al=m.getValue();
            for(int i=0;i<al.size();i++)
              System.out.print(al.get(i)+" ");
            System.out.println();  
        }
    }
	public static void main (String[] args) {
		Bottom_View_BT tree=new Bottom_View_BT();
		 tree.root = new Node(1); 
        tree.root.left =new Node(2); 
    tree.root.right = new Node(3); 
    tree.root.left.left =new Node(4); 
    tree.root.left.right = new Node(5); 
    tree.root.right.left = new Node(6); 
    tree.root.right.right = new Node(7); 
    tree.root.right.left.right = new Node(8); 
    tree.root.right.right.right = new Node(9); 
    tree.root.right.right.left= new Node(10); 
    tree.root.right.right.left.right= new Node(11); 
    tree.root.right.right.left.right.right= new Node(12); 
		
		tree.Bottom_View(tree.root);
		
		
	}
}
