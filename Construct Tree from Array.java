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
class ConstructTree_From_Array
{
	Node root;
	Node constructTree(int a[],Node root,int i,int n)
	{
		if(i<n)
		{
			 root=new Node(a[i]);
			root.left=constructTree(a,root.left,2*i+1,n);
			root.right=constructTree(a,root.right,2*i+2,n);

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
          int a[]=new int[n];
          for(int i=0;i<n;i++)
          	  a[i]=sc.nextInt();
          ConstructTree_From_Array tree=new ConstructTree_From_Array();
          tree.inOrder(tree.constructTree(a,tree.root,0,n));
    }
}
