package problem_Solution;

public class DistanceFromRoot {
	Node root;
	public void printKDistant(Node node, int k)
	{
		if(node==null)
			return;
		if(k==0)
			System.out.println(node.data);
		
		else
		{
			printKDistant(node.left,k-1);
			printKDistant(node.right,k-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DistanceFromRoot tree=new DistanceFromRoot();
		tree.root=new Node(1);
		 tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(8);
	  
	        tree.printKDistant(tree.root, 2);
		

	}

}
