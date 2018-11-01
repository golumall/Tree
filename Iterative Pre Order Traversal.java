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
class Iterative_PreOrder
{
    Node root;
    void traverse(Node root)
    {
    	if(root==null)
    		return;
    	Stack<Node> s=new Stack<Node>();
    	s.push(root);
    	while(!s.isEmpty())
    	{
    		Node u=s.pop();
    		System.out.print(u.data+" ");
    		if(u.right!=null)
    			s.push(u.right);
    		if(u.left!=null)
    			s.push(u.left);
    	}
    }
    public static void main(String[] args) {
    	Iterative_PreOrder tree=new Iterative_PreOrder();
    	tree.root = new Node(10); 
        tree.root.left = new Node(8); 
        tree.root.right = new Node(2); 
        tree.root.left.left = new Node(3); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(2); 
        tree.traverse(tree.root);
    }
}
