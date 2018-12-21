


class Node{
    int data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;
    }
}

class Sum_Of_height_Individual {
    Node root;
    static int sum=0;
   int getSum(Node node)
    {
        if(node==null)
          return 0;
       return node.data+getSum(node.left)+getSum(node.right);
        
    }
    void preOrder(Node node,int s)
    {
        if(node==null)
          return;
         if(s==getSum(node.left))
              sum=1;
                
          if(s==getSum(node.right))
            sum=1;
          preOrder(node.left,s);
          preOrder(node.right,s);
    }
    boolean check()
    {
        if(sum==1)
          return true;
         else
         return false;
    }
	public static void main (String[] args) {
		Sum_Of_height_Individual tree=new Sum_Of_height_Individual();
		tree.root=new Node(1);
		tree.root.left=new Node(3);
		tree.root.right=new Node(6);
		tree.root.left.left=new Node(5);
		tree.root.left.right=new Node(9);
		tree.root.right.left=new Node(8);
		tree.preOrder(tree.root,8);
		if(tree.check())
		 System.out.println("YES");
		else
		System.out.println("NO");
	
	}
}
