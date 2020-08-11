package problem_Solution;

import java.util.Scanner;

public class Kangaroo {
	static String kangaroo(int x1, int v1, int x2, int v2) {
     if(v2>v1)
     {
    	 return "No";
     }
     else
     {
    	 for(int i=0; x1<x2;i++)
    	 {
    		x1=x1+v1;
    		x2=x2+v2;
    		if(x1==x2)
    		{
    			return "yes";
    		}
    	 }
     }
   
     
    return "No";
     
    }

	public static void main(String[] args) {
		System.out.println("Enter the values");
		Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);

	}

}
