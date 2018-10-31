
//Sources
//https://www.youtube.com/watch?v=JPspskkZn9E

//https://www.geeksforgeeks.org/given-a-binary-tree-print-all-root-to-leaf-paths/


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
class PrintAllPath_RootToLeaf
{
   Node root;
   void printPath(Node root)
   {
   	int path[]=new int[1000];
   	printPathUtil(root,path,0);
   }
   void printPathUtil(Node root,int path[],int len)
   {
   	if(root==null)
   		return;
   	path[len]=root.data;
   	len++;
   	if(root.left==null&&root.right==null)
   		printArray(path,len);
   	else
   	{
   		printPathUtil(root.left,path,len);
   		printPathUtil(root.right,path,len);
   	}
   }
   void printArray(int path[],int len)
   {
   	for(int i=0;i<len;i++)
   		System.out.print(path[i]+" ");
   	System.out.println();
   }
   public static void main(String[] args) {
   	  PrintAllPath_RootToLeaf tree=new PrintAllPath_RootToLeaf();
   		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		tree.printPath(tree.root);
   	}	
}
