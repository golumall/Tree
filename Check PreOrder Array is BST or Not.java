import java.util.Scanner;
import java.util.Stack;
class Check_Array_Bst
{
   static boolean check(int a[],int n)
    {
       int root=Integer.MIN_VALUE;
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<n;i++)
       {
       	//If right element is less than root return false
          if(a[i]<root)
          	return false;
          //pop element of stack until peek element is less than current array element
          while(!st.isEmpty()&&st.peek()<a[i])
          {
          	root=st.pop();
          }
          //push current elemnt in Stack
          st.push(a[i]);
       }
       return true;
    }	
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int a[]=new int[n];
    	for(int i=0;i<n;i++)
    		a[i]=sc.nextInt();
       if(check(a,n))
       	System.out.println("True");
       else
       	System.out.println("False");
    }
}
