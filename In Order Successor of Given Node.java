

//Time Complexity O(n)
//Space Complexity O(n)

import java.util.Vector;
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
class Find_InOrder_Successor
{
	Node root;
	Vector<Integer> v=new Vector<Integer>();
	void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		v.add(root.data);
		inOrder(root.right);
	}
	void inOrderUtil(Node root,int k)
	{
		inOrder(root);
		int l=search(k);
		if(l==-1)
			System.out.println("NULL");
		else
			System.out.println(v.elementAt(l));


    }
    int search(int k)
    {
    	for(int i=0;i<v.size()-1;i++)
    	{
    		if(k==v.elementAt(i))
    			return i+1;
    	}
    	return -1;
    }
    public static void main(String[] args) {
    	Find_InOrder_Successor tree=new Find_InOrder_Successor();
    	tree.root=new Node(1);
    	tree.root.left=new Node(2);
    	tree.root.right=new Node(3);
    	tree.root.left.left=new Node(4);
    	tree.root.left.right=new Node(5);
    	tree.root.right.right=new Node(6);
    	Scanner sc=new Scanner(System.in);
    	int k=sc.nextInt();
    	tree.inOrderUtil(tree.root,k);

    }
}
