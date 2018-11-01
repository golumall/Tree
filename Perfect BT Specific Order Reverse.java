import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
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
class Perfect_BT_Specific_Order_Reverse
{
    Node root;
    void printTree(Node root)
    {
    	if(root==null)
    		return;
        Stack<Node> s=new Stack<Node>();
        s.push(root);
        if(root.left!=null)
        {
        s.push(root.right);
        s.push(root.left);
    }
        if(root.left.left!=null)
            printTreeUtil(root,s);
        while(!s.isEmpty())
        {
            System.out.print(s.pop().data+" ");
        }
    	

    }
    void printTreeUtil(Node root,Stack<Node> s)
    {
        if(root==null)
            return;
        Queue<Node> q=new LinkedList<Node>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty())
        {
            Node first=q.poll();
            Node second=q.poll();
            s.push(second.left);
            s.push(first.right);
            s.push(second.right);
            s.push(first.left);
          
          if(first.left.left!=null)
          {
            q.add(first.right);
            q.add(second.left);
            q.add(first.left);
            q.add(second.right);
          }

        }

    }
    public static void main(String[] args) {
    	Perfect_BT_Specific_Order_Reverse tree=new Perfect_BT_Specific_Order_Reverse();
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
