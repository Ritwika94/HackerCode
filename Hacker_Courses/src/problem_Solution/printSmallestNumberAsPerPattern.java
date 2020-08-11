package problem_Solution;

import java.util.Scanner;
import java.util.Stack;

public class printSmallestNumberAsPerPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of letters in pattern");
	    int n=sc.nextInt();
	    String arr[]=new String[n];
	    for(int i=0;i<n;i++)
	    {
	    	 System.out.println("Enter the letter");
	    	arr[i]=sc.next();
	    }
	    Stack<Integer> stck=new Stack<Integer>();
	    for(int i=0;i<=n;i++)
	    {
	    	stck.push(i+1);
	    	if(i==n || arr[i].equals("I"))
	    	{
	    		while(!stck.empty())
	    			System.out.print(stck.pop()+" ");
	    	}
	    }

	}

}
