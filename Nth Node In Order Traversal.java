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
class Nth_Node
{
	Node root;
	int c=0;
	void inOrder(Node root,int n)
	{
		if(root==null)
			return;
		inOrder(root.left,n);
		c++;
		if(c==n)
			System.out.println(root.data);
		inOrder(root.right,n);

	}
	public static void main(String[] args) {
		Nth_Node tree=new Nth_Node();
		tree.root=new Node(10);
		tree.root.left=new Node(20);
		tree.root.right=new Node(30);
		tree.root.left.left=new Node(40);
		tree.root.left.right=new Node(50);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		tree.inOrder(tree.root,n);
	}
	
}
