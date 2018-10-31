import java.util.Vector;
import java.util.Scanner;
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
class Generate_Tree
{
	Node root;
	void preOrder(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	Vector<Node> getTrees(int in[],int start,int end)
	{
		Vector<Node> trees=new Vector<Node>();
		if(start>end)
		{
			trees.add(null);
			return trees;
		}
		for(int i=start;i<=end;i++)
		{
			Vector<Node> ltrees=getTrees(in,start,i-1);
			Vector<Node> rtrees=getTrees(in,i+1,end);
			for(int j=0;j<ltrees.size();j++)
			{
				for(int k=0;k<rtrees.size();k++)
				{
					Node node=new Node(in[i]);
					node.left=ltrees.get(j);
					node.right=rtrees.get(k);
					trees.add(node);
				}
			}
		}
		return trees;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Generate_Tree tree=new Generate_Tree();
		int n=sc.nextInt();
		int in[]=new int[n];
		for(int i=0;i<n;i++)
			in[i]=sc.nextInt();
		Vector<Node> v=tree.getTrees(in,0,n-1);
		for(int i=0;i<v.size();i++)
		{
			tree.preOrder(v.get(i));
			System.out.println();

		}

}
}
