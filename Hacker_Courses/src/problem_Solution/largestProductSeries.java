package problem_Solution;

import java.util.Scanner;

public class largestProductSeries {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of testcases");
		int t=sc.nextInt();
		for(int m=0;m<t;m++)
	  {
		  int n=sc.nextInt();
		  int big=0;
			int k=sc.nextInt();
		   	String number=sc.next();
		   	//int n=number.length();
		    int arr[]=new int[n];
		    for (int i = 0; i < n; i++){
		        arr[i] = 	number.charAt(i) - '0';
		    }
		 for(int i=0;i<n;i++)
	    {
	    	int p=i;
	    	int product=arr[i];
	    	if(i+k-1<=n-1)
	    	{
	    		for(int j=i+1;j<=i+k-1;j++)
		    	{
		    	  product*=arr[j];
		    	  
		    	}
	    		
		    	if(product>big)
		    		big=product;
	    	}
	    	
	    }
	    
	   System.out.println(big); 	
	}
}

}
