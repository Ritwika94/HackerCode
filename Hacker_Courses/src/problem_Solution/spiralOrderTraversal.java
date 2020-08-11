package problem_Solution;

import java.util.Scanner;

public class spiralOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter no of rows");
	    int m=sc.nextInt();
	    System.out.println("Enter no of cols");
	    int n=sc.nextInt();
	    int arr[][]=new int[m][n];
	    int k=0, l=0;
	    for(int i=0;i<m;i++)
	    	for(int j=0;j<n;j++)
	    	{
	    		System.out.println("Enter the element");
	    		arr[i][j]=sc.nextInt();
	    	}
	    while(k<m && l<n)
	    {
	    	for(int i=l;i<n;++i)
	    	 System.out.println(arr[k][i]);
	        k++;
	        for(int i=k;i<m;++i)
	        {
	        	System.out.println(arr[i][n-1]);
	        }
	         n--;
	         for(int i=n-1;i>=l;--i)
	        	 System.out.println(arr[m-1][i]);
	         m--;
	         for(int i=m-1;i>=k;--i)
	         {
	        	 System.out.print(arr[i][l]+" ");
	         }
	         l++;
	    		
	    }

	}

}
