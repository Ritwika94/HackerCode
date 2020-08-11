package problem_Solution;

import java.util.Scanner;

public class maximumSumIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		//int max=arr[0];
		for(int p=0;p<n;p++)
		{
			arr1[p]=arr[p];
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j] && arr1[i]<arr1[j]+arr[i])
					arr1[i]=arr1[j]+arr[i];
			
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
