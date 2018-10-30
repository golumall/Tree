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
class Iterative_inOrder
{
   Node root;
   void traverse(Node node)
   {
   	if(node==null)
   		return;
   	Stack<Node>st=new Stack<Node>();
   	while(true)
   	{
   		if(node!=null)
   		{
   			st.push(node);
   			node=node.left;
   		}
   		else
   		{
   			if(st.isEmpty())
   				break;
   			node=st.pop();
   			System.out.print(node.data+" ");
   			node=node.right;
   		}
   	}

   }	
   public static void main(String[] args) {
   		Iterative_inOrder tree=new Iterative_inOrder();
   		tree.root=new Node(1);
   		tree.root.left=new Node(2);
   		tree.root.right=new Node(3);
   		tree.root.left.left=new Node(4);
   		tree.root.left.right=new Node(5);
   		tree.traverse(tree.root);
   	}

	
}
