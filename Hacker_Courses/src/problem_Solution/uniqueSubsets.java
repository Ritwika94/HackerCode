package problem_Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class uniqueSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer> map=new  HashMap<Integer,Integer>();
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			//System.out.println("Enter the element:");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<(1<<n);i++)
		{
			int sum=0,count=0;
			//System.out.print("{");
			for(int j=0;j<n;j++)
			{
				
			    if((i & (1<<j))> 0)
				{
			    	//System.out.print(a);
			    	sum+=arr[j];
			    	count++;
			    }
					
			 }
			if(count==m)
			{
				
					list.add(sum);
			}
			
		
			}
		Iterator itr=list.iterator();
		int sum1=0;
		while(itr.hasNext())
		{
			int s=(int)itr.next();
			if(Collections.frequency(list, s)==1)
			  sum1+=s;
			
		}
		System.out.println(sum1);
}

}
