package problem_Solution;

import java.util.Scanner;

public class largestPalindrome {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter no of testcases");
		int t=sc.nextInt();
	
		int n=0;
		int i,j = 0;
	
		for(int k=0;k<t;k++)
		{
			int temp=0;
			int big=0;
			System.out.println("Enter the value of n");
			n=sc.nextInt();
			
			for(i=100;i<=999;i++)
			{
				
				for( j=100;j<=999;j++)
				{
					temp=i*j;
					
					
					int value=isPalindrome(temp);
					if(temp>big && temp<n && value==1)
					{
						big=temp;
					}
				}
				
				
			}
			
			System.out.println(big);

		}
		}
 static int  isPalindrome(int a)	
	{
		int n=a;
		int reverse=0;
		while(n!=0)
		{
		reverse=reverse*10;
		reverse=reverse+(n%10);
		n=n/10;
		}
		if(reverse==a)
		return 1;
		else
			return 0;
		
	}

}
