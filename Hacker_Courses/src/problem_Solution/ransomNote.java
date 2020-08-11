package problem_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ransomNote {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of words in magazine");
		int m=sc.nextInt();
		System.out.println("Enter the number of words in ransom note");
		int n=sc.nextInt();
		String arr1[]=new 	String [m];
        String  arr2[]=new 	String [n];
        for(int i=0;i<m;i++)
        {
            arr1[i]=sc.next();
         }
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.next();
         }
		
		HashMap<String,Integer> map1=new HashMap<String,Integer> ();
		HashMap<String,Integer> map2=new HashMap<String,Integer> ();
		for(int i=0;i<arr1.length;i++)
		{
			String ch=arr1[i];
			if(map1.containsKey(ch))
					{
				       map1.put(ch, map1.get(ch)+1);
				    }
			else
				map1.put(ch,1);
		}
		for(int i=0;i<arr2.length;i++)
		{
			String ch=arr2[i];
			if(map2.containsKey(ch))
					{
				       map2.put(ch, map2.get(ch)+1);
				    }
			else
				map2.put(ch,1);
		}
		int flag=0;
		for(Map.Entry<String, Integer> list :map2.entrySet())
		{
			String str=list.getKey();
			if(map1.containsKey(str))
			{
				
				if(map1.get(str)>=map2.get(str))
					continue;
				else
				{
					flag=0;
				}
					
			}
			else
			{
				flag=1;
				System.out.println("hello"+list.getKey());
			}
			
			
				
		}
		if(flag==0)
			System.out.println("Yes");
		else
			System.out.println("No");
			
		

	}

}
