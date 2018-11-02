import java.util.Queue;
import java.util.LinkedList;
class ListNode
{
	int data;
	ListNode next;
	ListNode(int data)
	{
	this.data=data;
	next=null;
	}
}
class TreeNode
{
	int data;
	TreeNode left,right;
	TreeNode(int data)
	{
	this.data=data;
	left=right=null;
	}
}
class Construct_Tree_from_LinnkedList
{
	TreeNode root;
	ListNode head;
	void push(int data)
	{
		ListNode newNode=new ListNode(data);
		newNode.next=head;
		head=newNode;
	}
	TreeNode constructTree()
	{
		if(head==null)
		{
			root=null;
			return null;
		}
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		TreeNode node=new TreeNode(head.data);
		root=node;
		q.add(node);
			head=head.next;
		while(head!=null)
		{
			node=q.poll();
			TreeNode leftChild=null,rightChild=null;
			leftChild=new TreeNode(head.data);
			q.add(leftChild);
			head=head.next;
			if(head!=null)
			{
				rightChild=new TreeNode(head.data);
				q.add(rightChild);
				head=head.next;
			}
			node.left=leftChild;
			node.right=rightChild;
		}	
         return root;
	}
	void inOrder(TreeNode root)
	{
		if(root==null)
			return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public static void main(String[] args) {
		
		Construct_Tree_from_LinnkedList tree=new Construct_Tree_from_LinnkedList();
		tree.push(36);
		 tree.push(30); 
        tree.push(25); 
        tree.push(15); 
        tree.push(12); 
        tree.push(10);
        tree.inOrder(tree.constructTree());
	}
	
}
