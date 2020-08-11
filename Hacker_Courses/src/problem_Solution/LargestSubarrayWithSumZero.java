package problem_Solution;

import java.util.HashMap;

public class LargestSubarrayWithSumZero {

	public static void main(String[] args) {
		int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 }; 
        maxLen(arr);

	}

	private static void maxLen(int[] arr) {
	
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		int n=arr.length;
		int sum=0;
		int endindex = 0;
		int maxlen=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			if(arr[i]==0 && maxlen==0)
			{
				maxlen=1;
				endindex=i;
			}
			if(sum==0)
			{
				endindex=i;
				maxlen=i+1;
			}
			if(hmap.containsKey(sum))
			{
				
				if(i-hmap.get(sum)>maxlen)
				{
					maxlen=i-hmap.get(sum);
					endindex=i;
				}
			}
			
			else
				hmap.put(sum, i);
				
			
			
		}
		int start=endindex-maxlen+1;
		System.out.println("Maximum length:"+maxlen);
		System.out.println("Start index:"+start);
		System.out.println("End index:"+endindex);
		
	}

}
