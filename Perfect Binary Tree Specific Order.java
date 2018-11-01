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
class Perfect_BT_Specific_Order
{
    Node root;
    void printTree(Node root)
    {
    	if(root==null)
    		return;
    	System.out.print(root.data+" ");
    	if(root.left!=null)
    		System.out.print(root.left.data+" "+root.right.data+" ");
    	if(root.left.left==null)
    		return;
    	Queue<Node> q=new LinkedList<Node>();
    	q.add(root.left);
    	q.add(root.right);
    	while(!q.isEmpty())
    	{
    		Node first=q.poll();
    		Node second=q.poll();
    		System.out.print(first.left.data+" "+second.right.data+" ");
    		System.out.print(first.right.data+" "+second.left.data+" ");
              
              if(first.left.left!=null)
              {
              	q.add(first.left);
              	q.add(second.right);
              	q.add(first.right);
              	q.add(second.left);
              }

    	}

    }
    public static void main(String[] args) {
    	Perfect_BT_Specific_Order tree=new Perfect_BT_Specific_Order();
    	tree.root=new Node(1);
    	tree.root.left=new Node(2);
    	tree.root.right=new Node(3);
    	tree.root.left.left=new Node(4);
    	tree.root.left.right=new Node(5);
    	tree.root.right.left=new Node(6);
    	tree.root.right.right=new Node(7);
    	tree.root.left.left.left=new Node(8);
    	tree.root.left.left.right=new Node(9);
    	tree.root.left.right.left=new Node(10);
    	tree.root.left.right.right=new Node(11);
    	tree.root.right.left.left=new Node(12);
    	tree.root.right.left.right=new Node(13);
    	tree.root.right.right.left=new Node(14);
    	tree.root.right.right.right=new Node(15);
    	tree.printTree(tree.root);
    }
	
}
