package problem_Solution;

import java.util.Scanner;

public class maxStairHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    int n=sc.nextInt();
		    int sum=0;
		    int i=0;
		    for(i=1;i<=n;i++)
		    {
		        sum+=i;
		        if(sum<=n)
		         continue;
		         else
		         {
		        	
		        	break;
		         }
		       
		    }
		    System.out.println(i-1);
		}
		
	}

	}


