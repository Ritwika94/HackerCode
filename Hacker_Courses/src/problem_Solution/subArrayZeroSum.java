package problem_Solution;

import java.util.HashMap;
import java.util.Scanner;

public class subArrayZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the element");
			arr[i]=sc.nextInt();
		}
			int i=0;
		HashMap<Integer,Integer> list=new HashMap<Integer,Integer>();
		for(i=0;i<n;i++)
		{
			sum+=arr[i];
			if(arr[i]==0 || sum==0 ||list.get(sum)!=null)
			{
				System.out.println(" Subarray with sum zero exists");
				break;
			}
			else
				list.put(sum, i);
				
		}
		if(i==n)
		{
			System.out.println(" Subarray with sum zero does not exist");
		}
	}

}
