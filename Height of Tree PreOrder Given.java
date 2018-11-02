import java.util.Scanner;
class Height_PreOrder
{
	
	 int findHeightUtil(String str,int n,int index)
	{
       if(str.charAt(index)=='l'||index>=n)
       	return 0;
       index++;
       int l=findHeightUtil(str,n,index);
       index++;
       int r=findHeightUtil(str,n,index);
       return Math.max(l,r)+1;
	}
     int findHeight(String str,int n)
	{
		int index=0;
		return findHeightUtil(str,n,index);
	}
	public static void main(String[] args) {
		Height_PreOrder tree=new Height_PreOrder();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		
		System.out.println(tree.findHeight(str,n));
	}
}
