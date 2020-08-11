package problem_Solution;

import java.util.Scanner;

public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of numbers");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n ;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			int j=i+1;
			for(j=i+1; j<n; j++)
			{
				if(arr[i]>=arr[j])
					 continue;
				else
					break;
			}
		   if(j==n)
			   System.out.println(arr[i]);
		}
	}

}
