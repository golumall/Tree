
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
class Check_Root_To_Leaf
{
	Node root;
	boolean check(Node node,int arr[],int n,int index)
	{
		if(node==null)
			return (n==0);
		if((node.left==null&&node.right==null)&&(index==n-1&&arr[index]==node.data))
			 return true;
	    return ((index<n)&&arr[index]==node.data&&(check(node.left,arr,n,index+1)||check(node.right,arr,n,index+1)));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Check_Root_To_Leaf tree=new Check_Root_To_Leaf();
		tree.root=new Node(5);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(1);
		tree.root.left.right=new Node(4);
		tree.root.left.right.left=new Node(6);
		tree.root.left.right.right=new Node(8);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		if(tree.check(tree.root,a,n,0))
			System.out.println("YES");
		else
			System.out.println("NO");

			}
		}
