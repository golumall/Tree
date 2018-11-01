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
class Density
{
	Node root;
	static int s=0;
	int den(Node root)
	{
		if(root==null)
			return 0;
		int l=den(root.left);
		int r=den(root.right);
		s++;
		if(l>r)
		{
			
			return l+1;
		}
		else
		{
			
			return r+1;
		}
		
    }
    public static void main(String[] args) {
    	Density tree=new Density();
    	tree.root=new Node(10);
    	tree.root.left=new Node(20);
    	tree.root.right=new Node(30);
    	tree.root.left.left=new Node(40);
    	tree.root.left.right=new Node(40);
    	tree.root.right.left=new Node(40);
    	tree.root.right.right=new Node(40);
    	int x=tree.den(tree.root);
       System.out.println((double)s/x);
       //System.out.print(x);
    }
}
