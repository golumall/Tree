
//Sources
//https://www.geeksforgeeks.org/construct-a-special-tree-from-given-preorder-traversal/

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
class Special_Tree_from_Pre
{
	Node root;
	Node constructTree(int pre[],char preLN[],Node root,int i,int n)
	{
		if(i<n)
			root=new Node(pre[i]);
		if(preLN[i]=='N')
		{
			

			root.left=constructTree(pre,preLN,root.left,2*i+1,n);
			root.right=constructTree(pre,preLN,root.right,2*i+2,n);
		}
		return root;
	}
	void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pre[]=new int[n];
		char preLN[]=new char[n];
		for(int i=0;i<n;i++)
			pre[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			preLN[i]=sc.next().charAt(0);
		Special_Tree_from_Pre tree=new Special_Tree_from_Pre();
		tree.inOrder(tree.constructTree(pre,preLN,tree.root,0,n));
	}
	
}
