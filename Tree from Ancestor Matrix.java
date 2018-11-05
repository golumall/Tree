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
class AncestorMatrix
{
	
	static int mat[][];
	static int count[];
	Node root;
	AncestorMatrix(int n)
	{
       mat=new int[n][n];
       count=new int[n];
       
       for(int i=0;i<n;i++)
       {
       	count[i]=0;
       }
	}
	void sort(int n)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{
				if(count[j]>count[j+1])
				{
					count[j]^=count[j+1];
					count[j+1]^=count[j];
					count[j]^=count[j+1];
				}
			}
		}
	}
	void counts(int n)
	{
		for(int i=0;i<n;i++)
		{
			int c=0;
			for(int j=0;j<n;j++)
			{
				if(mat[i][j]==1)
					c++;
			}
			if(c==0)
				count[i]=i;
			else
			count[i]=c;
		}
	}
	Node constructTree(Node root,int i,int n)
	{
		if(i<n)
		{
			root=new Node(count[i]);
		root.left=constructTree(root.left,2*i+1,n);
		root.right=constructTree(root.right,2*i+2,n);
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
    AncestorMatrix tree=new AncestorMatrix(n);
     for(int i=0;i<n;i++)
     {
     	for(int j=0;j<n;j++)
     	{
     		mat[i][j]=sc.nextInt();
     	}
     }
     tree.counts(n);
     tree.sort(n);
     System.out.println();
     System.out.println();
     tree.inOrder(tree.constructTree(tree.root,0,n));
	}
	
}
