
//Source
//https://www.geeksforgeeks.org/modify-binary-tree-get-preorder-traversal-using-right-pointers/


import java.util.Stack;
//import java.util.Queue;
///import java.util.LinkedList;
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
class Modify_Bt_Get_PreOrder
{
	Node root,pre=null;
	void modify(Node node)  //Modify Usinng Stack
	{
		if(root==null)
			return;
		Stack<Node> s=new Stack<Node>();
		s.push(node);
		while(!s.isEmpty())
		{
			Node u=s.pop();
			if(u.right!=null)
				s.push(u.right);
			if(u.left!=null)
				s.push(u.left);
			if(pre!=null)
			{
				pre.right=u;
				
			}
			pre=u;
		}
	}
	

	
	void printTree(Node root)
	{
		while(root!=null)
		{
			System.out.print(root.data+" ");
			root=root.right;
		}
	}
public static void main(String[] args) {
		Modify_Bt_Get_PreOrder tree=new Modify_Bt_Get_PreOrder();
		tree.root=new Node(10);
		tree.root.left=new Node(8);
		tree.root.right=new Node(2);
		tree.root.left.left=new Node(3);
		tree.root.left.right=new Node(5);
		tree.modify(tree.root);
		tree.printTree(tree.root);
	}	
}
