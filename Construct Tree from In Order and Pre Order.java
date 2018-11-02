import java.util.Scanner;
class Node
{
	char data;
	Node left,right;
	Node(char data)
	{
	this.data=data;
	left=right=null;
	}
}
class Construct_Tree
{
   Node root;
   int index=0;
   int search(char in[],int start,int end,char val)
   {
   	int i;
   	for(i=start;i<=end;i++)
   	{
   		if(in[i]==val)
   			return i;
   	}
   	return i;
   }
   void inOrder(Node root)
   {
   	if(root==null)
   		return;
   	inOrder(root.left);
   	System.out.print(root.data+" ");
   	inOrder(root.right);
   }
   Node buildTree(char in[],char pre[],int start,int end)
   {
   	if(start>end)
   		return null;
   	Node tNode=new Node(pre[index++]);
   	if(start==end)
   		return tNode;
   	int inIndex=search(in,start,end,tNode.data);
   	tNode.left=buildTree(in,pre,start,inIndex-1);
   	tNode.right=buildTree(in,pre,inIndex+1,end);
   	return tNode;
   }
   public static void main(String[] args) {
   	Scanner sc=new Scanner(System.in);
   	String in=sc.next();
   	String pre=sc.next();
   	int len=in.length()-1;
   	Construct_Tree tree=new Construct_Tree();
   	tree.root=tree.buildTree(in.toCharArray(),pre.toCharArray(),0,len);
   	tree.inOrder(tree.root);
   }
}
