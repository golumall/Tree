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
class Find_Level
{
	Node root;
	void find(Node node)
	{
		int i=0;
       Stack<Node> s1=new Stack<Node>();
       Stack<Node> s2=new Stack<Node>();
       s1.push(node);
       while(!s1.isEmpty()||!s2.isEmpty())
       {
       	while(!s1.isEmpty())
       	{
       		root=s1.pop();
       		if(root.left!=null)
       			s2.push(root.left);
       		if(root.right!=null)
       			s2.push(root.right);
       		System.out.println(root.data+" -> "+i);
       	}
       	i++;
       	while(!s2.isEmpty())
       	{
       		root=s2.pop();
       		if(root.left!=null)
       			s1.push(root.left);
       		if(root.right!=null)
       			s1.push(root.right);
       		System.out.println(root.data+" -> "+i);
       	}
       	i++;
       }
	}
	public static void main(String[] args) {
		Find_Level tree=new Find_Level();
         tree.root=new Node(0);
         tree.root.left=new Node(2);
         tree.root.right=new Node(1);
         tree.root.left.left=new Node(6);
         tree.root.left.left.left=new Node(7);
         tree.root.right.left=new Node(5);
         tree.root.right.right=new Node(4);
         tree.find(tree.root);

	}
}
