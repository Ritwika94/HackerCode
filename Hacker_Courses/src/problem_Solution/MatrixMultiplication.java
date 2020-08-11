package problem_Solution;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n ;i++)
		{
			arr[i]=sc.nextInt();
		}
		int mat[][]=new int[n][n];
		int i,j,k,l,q;
	    for (i=0;i<n ;i++)
	    {
	    	mat[i][i]=0;
	    }
	    for(l=2; l<n;l++)
	    {
	    	for(i=1; i<n-l+1;i++)
	    	{
	    		j=i+l-1;
	    		if(j==n)
	    			continue;
	    		mat[i][j]=Integer.MAX_VALUE;
	    		for(k=i;k<=j-1;k++)
	    		{
	    			q=mat[i][k]+mat[k+1][j]+arr[i-1]*arr[k]*arr[j];
	    			if(q<mat[i][j])
	    				mat[i][j]=q;
	    		}
	    	    
	    	}
	    }
	    System.out.println("Minimum no of multiplications is:"+mat[1][n-1]);

	}

}
