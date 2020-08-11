package problem_Solution;

import java.util.Scanner;

public class MatrixProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
			
			int r=sc.nextInt();
			
			int c=sc.nextInt();
			int mat[][]=new int[r][c];
			
			boolean turn=false;
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					
					mat[i][j]=sc.nextInt();
				}
					
			}
			
		
			int i=0;
			int j=0;
			
			while(i<r && j<c)
			{
				boolean itr=cantake(mat,i,j,r,c);
				
				if(itr)
				{
					mat[i][j]=1;
					i++;
					j++;
					turn=!turn;
				}
				else
				{
					i++;
					j++;
				}
				
				
					
			}
			if(turn)
				System.out.println("Ashish"); 
			else
				System.out.println("Vivek"); 
		t--;
		}
		
		

	}

	private static boolean cantake(int[][] mat, int r1, int c1, int r, int c) {
		
		for(int i=0;i<c;i++)
		{
			
			if(mat[r1][i]==1)
			{
				
				return false;
			}
				
		}
		for(int i=0;i<r;i++)
		{
			
			if(mat[i][c1]==1)
			{
				
				return false;
			}
		}
		return true;
	}

}
