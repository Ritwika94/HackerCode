package problem_Solution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RegularExpressionProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String, String> map1=new HashMap<String, String>();
		HashMap<String, String> map2=new HashMap<String, String>();
		System.out.println("Enter the no of records");
		int n=sc.nextInt();
		System.out.println("Enter name and email-id");
		for(int i=0;i<n; i++)
		{
			
			String name=sc.next();
			String emailId=sc.next();
			map1.put(name,emailId);
		}
		String pattern="@gmail.com";
		for(Map.Entry<String, String> entry: map1.entrySet())
		{
			String value=entry.getValue();
			if(value.matches(".*@gmail.com$"))
			{
				map2.put(entry.getKey(),entry.getValue());
			}
		}
		
		Set<String> namelist=map2.keySet();
        int n2=map2.size();
       
        String arr[]=new String[n2];
        Iterator itr=namelist.iterator();
        for(int i=0;i<n2;i++)
        {
        	if(itr.hasNext())
        	{
        		String str=(String) itr.next();
        		arr[i]=str;
        		
        	}
        	else
        		break;
        	
        		
        }
        for(int i=0;i<n2;i++)
		{
			System.out.println(arr[i]);
		}
        String temp=null;
        for(int i=0;i<n2-1;i++)
        {
        	
        	for(int j=0;j<n2-1-i;j++)
        	{
        		
        		if(arr[j].compareTo(arr[j+1])>=0)
        		{
        			String temp1=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp1;
        			
        		}
        		
        			
        		
        	}
        }
        
	}

}
