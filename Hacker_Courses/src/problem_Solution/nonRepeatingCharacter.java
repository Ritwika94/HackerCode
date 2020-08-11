package problem_Solution;

import java.util.HashMap;
import java.util.Scanner;

public class nonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.next();
		char str1[]=str.toCharArray();
		HashMap<Character,Integer> list=new HashMap<Character,Integer>();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str1[i];
			if(list.containsKey(ch))
					{
				       list.put(ch, list.get(ch)+1);
				    }
			else
				list.put(ch,1);
		}
		int flag=0;
		for(int i=0;i<len;i++)
		{
			char ch=str1[i];
			if(list.get(ch)==1)
			{
				System.out.println("First non repeating character is:"+ch);
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("No non-repeating character present");
		}
		

	}

}
