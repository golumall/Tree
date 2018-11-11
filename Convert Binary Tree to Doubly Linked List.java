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
class ListNode
{
	int data;
	ListNode prev,next;
	ListNode(int data)
	{
	this.data=data;
	prev=next=null;
	}
}
class ConvertTree_List
{
    TreeNode root;
    ListNode head,temp;
    void convertTree(TreeNode node)
    {
    	if(node==null)
    		return;
    	convertTree(node.left);
    	if(head==null)
    	{
    		head=new ListNode(node.data);
            temp=head;
    	}
    	else
    	{
    		ListNode newNode=new ListNode(node.data);
    		newNode.prev=temp;
    		temp.next=newNode;
    		temp=temp.next;
    	}
    	convertTree(node.right);

    }
    void listTraverse(ListNode head)
    {
       while(head!=null)
       {
       	System.out.print(head.data+" ");
       	head=head.next;
       }
    }
    public static void main(String[] args) {
    	ConvertTree_List tree=new ConvertTree_List();
    	tree.root=new TreeNode(10);
    	tree.root.left=new TreeNode(12);
    	tree.root.right=new TreeNode(15);
    	tree.root.left.left=new TreeNode(25);
    	tree.root.left.right=new TreeNode(30);
    	tree.root.right.left=new TreeNode(36);
    	tree.convertTree(tree.root);
    	tree.listTraverse(tree.head);
    }
}
