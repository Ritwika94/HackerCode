package problem_Solution;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t>0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			
			int arr[][]=new int[n][2];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			
			for(int i=0;i<n;i++)
				b[i]=sc.nextInt();
			if(sorted(a,a.length))
				System.out.println("Yes");
			else
			{
				for(int i=0;i<n;i++)
				{
					arr[i][0]=a[i];
					arr[i][1]=b[i];
					
				}
				
				
				int arr1[][]=new int[n][2];
				for(int i=0;i<n;i++)
				{
					arr1[i][0]=arr[i][0];
					arr1[i][1]=arr[i][1];
					
				}
				Arrays.sort(arr1, (x,y)->{
					if(x[1]!=y[1])
						return (x[0]-y[0]);
					return 0;
					
				});
				
				int k=0;
				for(k=0;k<n;k++)
				{
					
					if(arr[k][0]==arr1[k][0])
						continue;
					else
						break;
				}	
				if(k==n)
					System.out.println("No");
				else
					System.out.println("Yes");
				
				
			}
			
			t--;
			
		}
	}

	private static boolean sorted(int [] arr, int n) {
		if(n==0 ||n==1)
			return true;
		for(int i=1;i<n;i++)
		{
			if(arr[i-1]>arr[i])
				return false;
		}
		return true;
	}

}
