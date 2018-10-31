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
class Nth_Node_Post
{
	Node root;
	int c=0;
	void postOrder(Node root,int n)
	{
		if(root==null)
			return;
		postOrder(root.left,n);
		postOrder(root.right,n);
		c++;
		if(c==n)
			System.out.println(root.data);
		

	}
	public static void main(String[] args) {
		Nth_Node_Post tree=new Nth_Node_Post();
		tree.root=new Node(10);
		tree.root.left=new Node(20);
		tree.root.right=new Node(30);
		tree.root.left.left=new Node(40);
		tree.root.left.right=new Node(50);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		tree.postOrder(tree.root,n);
	}
	
}
