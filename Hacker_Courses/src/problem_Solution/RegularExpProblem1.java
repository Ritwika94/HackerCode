package problem_Solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegularExpProblem1 {
  private String name;
  private String emailid;
  public String getName() {
		return name;
	}

public String getEmailid() {
		return emailid;
	}

	
	
	public RegularExpProblem1(String name, String emailid) {
		super();
		this.name = name;
		this.emailid = emailid;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList<RegularExpProblem1> list=new ArrayList<RegularExpProblem1>();
   ArrayList<RegularExpProblem1> list1=new ArrayList<RegularExpProblem1>();
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the no of records");
		int n=sc.nextInt();
		//System.out.println("Enter name and email-id");
		for(int i=0;i<n; i++)
		{
			
			String name=sc.next();
			String emailId=sc.next();
			list.add(new RegularExpProblem1(name,emailId));
		}
		String pattern="@gmail.com";
		for( RegularExpProblem1 ref:list)
		{
			String value=ref.getEmailid();
			if(value.matches(".*@gmail.com$"))
			{
				list1.add(ref);
			}
		}
		int n2=list1.size();
	       
        String arr[]=new String[n2];
		Iterator itr=list1.iterator();
		for(int i=0;i<n2;i++)
        {
        	if(itr.hasNext())
        	{
        		RegularExpProblem1 str=(RegularExpProblem1) itr.next();
        		arr[i]=str.getName();
        		
        	}
        	else
        		break;
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
        for(int i=0;i<n2;i++)
		{
			System.out.println(arr[i]);
		}

}

}