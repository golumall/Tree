import java.util.Vector;
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
class Sum_InOrder_Predecessor
{
	Node root;
	int i=1;
	Vector<Integer> v=new Vector<Integer>();
	
	void inOrder(Node root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		v.add(root.data);
		inOrder(root.right);
	}
	void inOrderSum(Node root)
	{
		if(root==null)
			return;
        inOrderSum(root.left);
        root.data=v.elementAt(i-1)+v.elementAt(i+1);
        i++;
        inOrderSum(root.right);
	}
	void printInOrder(Node root)
	{
		if(root==null)
			return;
		printInOrder(root.left);
		System.out.print(root.data+" ");
		printInOrder(root.right);
	}
	void inOrderUtil(Node root)
	{
		v.add(0);//add first element zero
		inOrder(root);
		v.add(0);//add last element zero
		inOrderSum(root);
		printInOrder(root);
	}
	public static void main(String[] args) {
		Sum_InOrder_Predecessor tree=new Sum_InOrder_Predecessor();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		tree.printInOrder(tree.root);
		System.out.println();
		tree.inOrderUtil(tree.root);
	}
	
}
