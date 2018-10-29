import java.util.Queue;
import java.util.LinkedList;
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
class Print_LeafNode
{
   Node root;
   void printleaf(Node root)
   {
   	if(root==null)
   		return;
   	Queue<Node> q=new LinkedList<Node>();
   	q.add(root);
   	while(!q.isEmpty())
   	{
   		Node u=q.poll();
   		if(u.left==null&&u.right==null)
   			System.out.print(u.data+" ");
   		if(u.left!=null)
   			q.add(u.left);
   		if(u.right!=null)
   			q.add(u.right);
   	}
   }
   public static void main(String[] args) {
   	Print_LeafNode tree=new Print_LeafNode();
   	tree.root=new Node(10);
		tree.root.left=new Node(11);
		tree.root.left.left=new Node(7);
		tree.root.left.right=new Node(12);
		tree.root.right=new Node(9);
		tree.root.right.left=new Node(15);
		tree.root.right.right=new Node(8);
		tree.printleaf(tree.root);
   }

} 
