package problem_Solution;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class balancedParentheses {

	public static void main(String[] args) {
		Stack<Character> stackList=new Stack<Character>();
		Scanner sc=new Scanner(System.in);
	   
	    
	    String pattern=sc.next();
	    int n=pattern.length();
	    char arr[]=new char[n];
	    arr=pattern.toCharArray();
	    int  i=0;
	for(i=0;i<arr.length;i++)
     {
    	 
    	 if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[')
    	 {
    		 stackList.push(arr[i]);
    	 }
    	 if(arr[i]==')' || arr[i]=='}' || arr[i]==']')
    	 {
    		 if(stackList.isEmpty())
    		 {
    			 System.out.println("Not Balanced");
    			 break;
    		 }
    			 
    		 char ch=stackList.peek();
    		 if((ch=='('&& arr[i]==')')||(ch=='{'&& arr[i]=='}')||(ch=='['&& arr[i]==']') )
    		 {
    			 stackList.pop();
    		 }
    		 else
    		 {
    			 //System.out.println("Not Balanced");
    			 break;
    		 }
    	 }
    	 
     }
     
     if(stackList.isEmpty()&&i==arr.length)
     {
    	 System.out.println("Balanced");
     }
     else
     {
    	 System.out.println("Not Balanced");
     }
	
}

}
