package problem_Solution;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class TestDemo {

	public static void main(String[] args) {
		
		 HashMap<Integer,Character> list=new HashMap<Integer,Character>();
		 list.put(10, 's'); 
		 list.put(6, 'b'); 
		 list.put(20, 'a'); 
		 list.put(2, 'p');
		 Set<Integer> key1= list.keySet(); 
		 TreeSet<Integer> keys=new TreeSet<Integer>(key1); 
		 TreeSet<Integer> keys2=(TreeSet<Integer>)keys.descendingSet();
		 Iterator<Integer> it=keys2.iterator();
		 System.out.println(list.get(it.next()));
		 
		/*String s="ogtdes";
		String p="dogs";
		int i=0;
		for(i=0;i<p.length();i++)
		{
			Character c=p.charAt(i);
			if(s.indexOf(c)==-1)
			{
				break;
			}
			
		}
		if(i==p.length())
			System.out.println("True");
		else
			System.out.println("False");*/
			

	}

}
