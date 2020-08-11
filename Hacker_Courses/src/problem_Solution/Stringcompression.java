package problem_Solution;

public class Stringcompression {

	public static void main(String[] args) {
		String str="wwwwaaabbc";
		int n=str.length();
		int i=0;
		while(i<n)
		{
			int c=1;
			
			while(i<n-1 && str.charAt(i)==str.charAt(i+1))
			{
				c++;
				i++;
			}
			
			System.out.print(""+str.charAt(i)+c);
			i++;
		}

	}

}
