/*package whatever //do not write package name here */

import java.io.*;
class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}
class Sum_Of_All_Numbers_Forms_Root_To_Leaf {
    Node root;
    int numbers(Node node)
    {
        int val=0;
        return numbersUtil(node,val);
    }
    int numbersUtil(Node node,int val)
    {
        if(node==null)
           return 0;
         val=(val*10+node.data);
         if(node.left==null&&node.right==null)
           return val;
         return numbersUtil(node.left,val)+numbersUtil(node.right,val);
    }
	public static void main (String[] args) {
		Sum_Of_All_Numbers_Forms_Root_To_Leaf tree=new Sum_Of_All_Numbers_Forms_Root_To_Leaf();
		tree.root=new Node(6);
		tree.root.left=new Node(3);
		tree.root.right=new Node(5);
		tree.root.left.left=new Node(2);
		tree.root.left.right=new Node(5);
		tree.root.right.right=new Node(4);
		tree.root.left.right.left=new Node(7);
		tree.root.left.right.right=new Node(4);
		
		System.out.println(tree.numbers(tree.root));
		
		
	}
}
