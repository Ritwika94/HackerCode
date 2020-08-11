package problem_Solution;

import java.util.Scanner;

public class minimumEdits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String first=sc.next();
		System.out.println("Enter the second String");
		String second=sc.next();
		int len1=first.length();
		int len2=second.length();
		char str1[]=first.toCharArray();
		char str2[]=second.toCharArray();
		int arr[][]=new int[len1+1][len2+1];
		for(int i=0;i<=len1;i++)
		{
			for(int j=0;j<=len2;j++)
			{
				if(i==0)
					arr[i][j]=j;
				else if(j==0)
					arr[i][j]=i;
				else if(str1[i-1]==str2[j-1])
					arr[i][j]=arr[i-1][j-1];
				else
					arr[i][j]=1+min(arr[i-1][j-1],arr[i][j-1],arr[i-1][j]);
			}
		}
		System.out.println("Minimum no of edits is:"+arr[len1][len2]);
		

	}
	
	static int min(int a, int b, int c)
	{
		if(a<=b)
		{
			if(a<=c)
			{
				return a;
			}
			else
				return c;
		}
		else
		{
			if(b<=c)
				return b;
			else
				return c;
		}
	}

}
