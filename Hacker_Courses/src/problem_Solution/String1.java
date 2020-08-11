package problem_Solution;


public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
	String  word="This is a dog";
	String []arr=word.split(" ");
	for(String ref: arr)
	{
		System.out.println(ref);
	}
	String word1=null;
	word1=arr[0].concat(arr[1]);
   for(int i=2; i<arr.length-1; i++)
   {
	 word1=word1.concat(arr[i].concat(arr[i+1])); 
   }
	
	System.out.println(word1);
	}	
}
