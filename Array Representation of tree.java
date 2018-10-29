class Array_representation
{
	
	static char str[]=new char[20];
	void setRoot(char s)
	{
		str[0]=s;
	}
   void setLeft(char l,int root)
   {
   	if(str[root]=='\0')
   		System.out.println("Can not be child of this root");
     else
     str[2*root+1]=l;

   }
   void setRight(char r,int root)
   {
     if(str[root]=='\0')
   		System.out.println("Can not be child of this root");
     else
     str[2*root+2]=r;

   }
   void printArray()
   {
   	for(int i=0;i<str.length;i++)
   	{
   		System.out.print(str[i]+" ");
   	}
   }
   public static void main(String[] args) {
   	Array_representation tree=new Array_representation();
   	tree.setRoot('a');
   	tree.setLeft('b',0);
   	tree.setRight('c',0);
   	tree.setLeft('d',1);
   	tree.setRight('e',1);
   	
   	tree.printArray();
   }

}
