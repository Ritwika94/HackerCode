package problem_Solution;

import java.util.Scanner;

public class longestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int  arr[]=new int[n];
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			arr1[i]=1;
		}
		
		for(int i=1;i<n;i++)
		{
          
			for(int j=0;j<i;j++)
			{
				
				if(arr[i]>arr[j] && arr1[i]<arr1[j]+1)
					
				{
					arr1[i]=arr1[j]+1;
					
					
				}
					
			}
			
           
		}
		
		int max=arr1[0];
		for(int i=0;i<n;i++)
		{
			if(arr1[i]>max)
				max=arr1[i];
		}
		System.out.println(max);
	}

}
