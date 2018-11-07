import java.util.Stack;
class TreeNode
{
	int data;
	TreeNode left,mid,right;
	TreeNode(int data)
	{
	this.data=data;
	left=mid=right=null;
	}

}
class ListNode
{
	int data;
	ListNode next,prev;
	ListNode(int data)
	{
	this.data=data;
	next=prev=null;
	}
}
class TernaryTree_To_DoublyList
{
	TreeNode root;
	ListNode getList(TreeNode root)
	{
		if(root==null)
			return null;
		Stack<TreeNode> s=new Stack<TreeNode>();
		s.push(root);
		ListNode listRoot=new ListNode(root.data);
		ListNode temp;
		temp=listRoot;
        TreeNode u=s.pop();
        if(u.right!=null)
        	s.push(u.right);
        if(u.mid!=null)
        	s.push(u.mid);
        if(u.left!=null)
        	s.push(u.left);
 
		while(!s.isEmpty())
		{
			 u=s.pop();
			ListNode l=new ListNode(u.data);
               temp.next=l;
               l.prev=temp;
               temp=temp.next;
             if(u.right!=null)
        	s.push(u.right);
        if(u.mid!=null)
        	s.push(u.mid);
        if(u.left!=null)
        	s.push(u.left);
            
 
		}
		return listRoot;
	}
	void traverse(ListNode head)
	{
		System.out.print("NULL<-");
		while(head!=null)
		{
			if(head.next!=null)
			System.out.print(head.data+"<->");
		else
			System.out.print(head.data);

			head=head.next;
		}
		System.out.print("->NULL");

	}
	public static void main(String[] args) {
		TernaryTree_To_DoublyList tree=new TernaryTree_To_DoublyList();
		tree.root=new TreeNode(30);
		tree.root.left=new TreeNode(5);
		tree.root.mid=new TreeNode(11);
		tree.root.right=new TreeNode(63);
		tree.root.left.left=new TreeNode(1);
		tree.root.left.mid=new TreeNode(4);
		tree.root.left.right=new TreeNode(8);
		tree.root.mid.left=new TreeNode(6);
		tree.root.mid.mid=new TreeNode(7);
		tree.root.mid.right=new TreeNode(15);
		tree.root.right.left=new TreeNode(31);
		tree.root.right.mid=new TreeNode(55);
		tree.root.right.right=new TreeNode(65);
		tree.traverse(tree.getList(tree.root));
		
	}


	
}
