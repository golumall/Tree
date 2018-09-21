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
class CheckBtIsBstOrNot
{
    Node root;
boolean checkTree(Node root,int min,int max)
 {
    if(root==null)
     return true;
     if(root.data<=min||root.data>=max)
     return false;
     return (checkTree(root.left,min,root.data)&&checkTree(root.right,root.data,max));
    
 }
    public static void main (String[] args) {
        CheckBtIsBstOrNot tree=new CheckBtIsBstOrNot();
        tree.root=new Node(12);
        tree.root.left=new Node(81);
        tree.root.right=new Node(24);
        tree.root.left.left=new Node(5);
        tree.root.left.right=new Node(10);
   if(tree.checkTree(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE))
      System.out.println("Tree is Bst");
   else
      System.out.println("Tree is Not Bst");
    }
}
