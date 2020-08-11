package problem_Solution;

import java.util.Scanner;

public class Encrytion {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char arr[]=str.toCharArray();
	    
	    int row=0;
		int col=0;
		int a=0,b = 0,c=0;
		int row1=(int) Math.floor(Math.sqrt(str.length()));
		int col1=row1;
		int col2=row1+1;
		int row2=(int) Math.ceil(Math.sqrt(str.length()));
		int col3=row2;
		int a1=row1*col1;
		int b1=row1*col2;
		int c1=row2*col3;
		if(a1>=arr.length)
		{
			a=a1;
		}
		if(b1>=arr.length)
		{
			b=b1;
		}
		if(c1>=arr.length)
		{
		  c=c1;
		}
	if(a>0 && b>0 &&c>0)
	{
		if(a<b)
		{
			if(a<c)
			{
				row=row1;
				col=col1;
			}
			else
			{
				row=row2;
				col=col3;
			}
		}
		else
		{
			if(b<c)
			{
				row=row1;
				col=col2;
			}
			else
			{
				row=row2;
				col=col3;
			}
		}
	}
	if(a>0 && b>0)
	{
		if(a<b)
		{
			row=row1;
			col=col1;
		}
		else
		{
			row=row1;
			col=col2;
		}
	}
	if(a>0 && c>0)
	{
		if(a<c)
		{
			row=row1;
			col=col1;
		}
		else
		{
			row=row2;
			col=col3;
		}
	}
		
	if(b>0 && c>0)
	{
		if(b<c)
		{
			row=row1;
			col=col2;
		}
		else
		{
			row=row2;
			col=col3;
		}
	}	
	if(a>0 && b==0 && c==0)
	{
		row=row1;
		col=col1;
	}
	if(b>0 && a==0 && c==0)
	{
		row=row1;
		col=col2;
	}
		
	if(c>0 && a==0 && b==0)
	{
		row=row2;
		col=col3;
	}	
	
		char arr1[][] = new char[row][col];
		
		int k=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr1[i][j]=arr[k];
				k=k+1;
				if(k==arr.length)
				{
					break;
				}
			}
			
		}
		
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				   
					if(arr1[j][i]!= '\0')
					{
						System.out.print(arr1[j][i]);
					}
					
				
			}
			System.out.print(" ");
		}
	
			
		
		
	}

}
