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
class Construct_InOrder_Tree
{
	Node root;
	void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	Node getTree(Node root,int a[],int start,int end)
	{
		if(start>end)
			return null;
		int maxInd=max(a,start,end);
		root=new Node(a[maxInd]);
		root.left=getTree(root.left,a,start,maxInd-1);
		root.right=getTree(root.right,a,maxInd+1,end);
		return root;
	}
   int max(int a[],int start,int end)
   {
   	int i,max=a[start],maxIndex=start;
   	for(i=start+1;i<=end;i++)
   	{
   		if(a[i]>max)
   		{
   			maxIndex=i;
   			max=a[i];

   		}
   	}
   	return maxIndex;
   }
	public static void main(String[] args) {
		Construct_InOrder_Tree tree=new Construct_InOrder_Tree();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		tree.inOrder(tree.getTree(tree.root,a,0,n-1));
	}
}
