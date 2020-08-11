package problem_Solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class makingAnagramsByDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String first=sc.next();
		System.out.println("Enter the second String");
		String second=sc.next();
		int len1=first.length();
		int len2=second.length();
		
		int count1[] = new int[26]; 
        int count2[] = new int[26];
 
        for (int i = 0; i < first.length() ; i++)
            count1[first.charAt(i) -'a']++;
     
        for (int i = 0; i < second.length() ; i++)
            count2[second.charAt(i) -'a']++;
		
        int result = 0;
        for (int i = 0; i < 26; i++)
            result += Math.abs(count1[i] -  count2[i]);
        System.out.println("Number of deletions is:"+result);
                             
      
	}

}
