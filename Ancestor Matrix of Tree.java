import java.util.Vector;
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
class Ancestor_Mtarix
{
	final int max=100;
	int mat[][]=new int[max][max];
	Vector<Integer> v=new Vector<Integer>();
	Node root;
	Ancestor_Mtarix()
   {
   	for(int i=0;i<max;i++)
   	{
   		for(int j=0;j<max;j++)
   		{
   			mat[i][j]=0;
   		}
   	}

    }
	void ancMat(Node root)
	{
     int n=ancestor(root);
     for(int i=0;i<n;i++)
     {
     	for(int j=0;j<n;j++)
     	{
     		System.out.print(mat[i][j]+" ");
     	}
     	System.out.println();
     }
	}
	int ancestor(Node root)
	{
		if(root==null)
			return 0;
		int data=root.data;
		for(int i=0;i<v.size();i++)
			mat[v.elementAt(i)][data]=1;
         v.addElement(data);
		int l=ancestor(root.left);
		int r=ancestor(root.right);
	if(v.size()-1>=0)
	v.remove(v.size()-1);
		return l+r+1;
	}
	public static void main(String[] args) {
		Ancestor_Mtarix tree=new Ancestor_Mtarix();
		tree.root=new Node(5);
		tree.root.left=new Node(1);
		tree.root.right=new Node(2);
		tree.root.left.left=new Node(0);
		tree.root.left.right=new Node(4);
		tree.root.right.left=new Node(3);
		tree.ancMat(tree.root);
	}
}
