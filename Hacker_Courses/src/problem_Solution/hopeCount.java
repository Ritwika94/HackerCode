package problem_Solution;

import java.util.Scanner;

public class hopeCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of steps");
		int n=sc.nextInt();
		int count=Count(n);
		System.out.println(count);
	}
	
  static int Count(int n)
  {
	  int arr[]=new int[n+1];
	  arr[0]=1;
	  arr[1]=1;
	  arr[2]=2;
	  for(int i=3;i<=n;i++)
	  {
		 arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
	  }
	  return arr[n];
  }

}
