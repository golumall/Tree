
//Sources
//https://www.geeksforgeeks.org/check-for-children-sum-property-in-a-binary-tree/

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
class Check_Children_Sum
{
	Node root;
	boolean check(Node root)
	{
		if(root==null)
			return true;
		check(root.left);
		if(root.left!=null&&root.right!=null)
                if(root.data!=(root.left.data+root.right.data))
				return false;
		else if(root.left!=null&&root.right==null)
		{
	       if(root.data!=root.left.data)
	          return false;    
		}
		else if(root.left==null&&root.right!=null)
		{
			if(root.right.data!=root.data)
				return false;
		}

	    check(root.right);
	return true;
	}
	public static void main(String[] args) {
	   	 Check_Children_Sum tree=new  Check_Children_Sum();
	   	 tree.root=new Node(10);
	   	 tree.root.left=new Node(8);
	   	 tree.root.right=new Node(9);
	   	 tree.root.left.left=new Node(3);
	   	 tree.root.left.right=new Node(5);
	   	 tree.root.right.left=new Node(2);
	   	 if(tree.check(tree.root))
	   	 	System.out.println("YES");
	   	 else
	   	 	System.out.println("NO");
	   }   

}
