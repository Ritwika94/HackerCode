package problem_Solution;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class practiceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of integers");
		int n=sc.nextInt();
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 ArrayList<Integer> list=new ArrayList<Integer>();
	 for(int i: arr)
	 {
		 String str=Integer.toString(i);
		 if(str.contains("1")&& str.contains("2")&& str.contains("3"))
			 list.add(new Integer(i));
	 }
		Collections.sort(list);
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println((int)itr.next());
		}

}
}
