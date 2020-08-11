package problem_Solution;

public class LongestPallindromicSubstring {

	public static void main(String[] args) {
		String str = "forgeeksskeegfor"; 
         longestPalSubstr(str); 

	}

	private static void longestPalSubstr(String str) {
		int n=str.length();
		int T[][]=new int[n][n];
		int maxlen=1;
		
		int end=0;
		for(int i=0;i<n;i++)
		{
			T[i][i]=1;
		}
		for(int cl=2;cl<=n;cl++)
		{
			for(int i=0;i<n-cl+1;i++)
			{
				int j=i+cl-1;
				if(str.charAt(i)==str.charAt(j) && cl==2)
				{
					T[i][j]=2;
					
					if(cl>maxlen)
					{
						maxlen=cl;
						end=j;
					}
				}
				if(T[i+1][j-1]>0 && str.charAt(i)==str.charAt(j))
				{
					T[i][j]=2+T[i+1][j-1];

					if(cl>maxlen)
					{
						maxlen=cl;
						end=j;
					}
				}
				
			}
			
		}
		System.out.println(maxlen);
		int start=end-maxlen+1;
		System.out.println(str.substring(start, end+1));
		
		
	}

}
