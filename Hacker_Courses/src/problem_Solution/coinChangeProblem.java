package problem_Solution;

import java.util.Scanner;

public class coinChangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int target=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      
      int ways=coinCount(arr,n,target);
      System.out.println("Number of count: "+ways);
	}
   public static int coinCount(int S[], int n, int m)
   {
	   int S1[][]=new int[n][m+1];
	   int count=0;
	   for(int i=0;i<n;i++)
		   S1[i][0]=1;
	   for(int i=0;i<n;i++)
	   {
		   for(int j=1;j<m+1;j++)
		   {
			   int x=(j-S[i]>=0)?S1[i][j-S[i]]:0;
			   int y=(i>=1)?S1[i-1][j]:0;
			   S1[i][j]=x+y;
		   }
	   }
	   return S1[n-1][m];
   }
}
