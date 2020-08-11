

import java.util.Scanner;

public class dayOfTheProgrammer {
	static String solve(int year){
		if(year>=1700 && year<=1917)
		{
			if(year%4==0)
			{
				return "12.09."+year;
			}
			else
			{
				return "13.09."+year;
			}
		}
		else if(year==1918)
		{
			return "26.09."+year;
		}
		else if (year>=1919 && year<=2700)
		{
			if(year%400==0)
			{
				return "12.09."+year;
			}
			else if(year%4==0 && year%100!=0)
			{
				return "12.09."+year;
			}
			else
			{
				return "13.09."+year;
			}
		}
		else
		{
			return "Enter a valid year";
		}
       
    }

	public static void main(String[] args) {
		System.out.println("Enter a year");
		Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
	}

}
