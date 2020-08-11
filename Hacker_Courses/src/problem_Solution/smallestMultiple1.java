package problem_Solution;

import java.util.Scanner;

public class smallestMultiple1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter no of testcases");
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter the value of n");
			int n=sc.nextInt();
			int arr[] = new int[n];
		
			for(int j=1;j<=n;j++)
			{
				arr[j-1]=j;
			}
			int result=arr[0];
			for(int k=1;k<n;k++)
			{
				result=(result*arr[k]/gcd(result, arr[k]));
			}
			System.out.println(result);
		}
	}
	static int gcd(int a, int b)
	{
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
		
	}



	
}
