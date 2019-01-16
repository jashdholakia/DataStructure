package tree;

import java.util.ArrayList;
import java.util.ListIterator;

public class BTreeMain 
{
	private static TreeNode root; // Has-A releationship
	
	public static void main(String[] args) 
	{
		BinaryTreeTraversal bTree = new BinaryTreeTraversal();
		
		/* Creating a tree and insert a data on tree node */
		root= new TreeNode(1);
		root.leftNode= new TreeNode(2);
		root.leftNode.leftNode= new TreeNode(4);
		root.leftNode.rightNode= new TreeNode(5);
		root.rightNode= new TreeNode(3);
		root.rightNode.leftNode= new TreeNode(6);
		root.rightNode.rightNode= new TreeNode(7);
		
		ArrayList<Integer> preOrderList= bTree.preOrder(root);
		ListIterator list =  preOrderList.listIterator();
		System.out.print("Pre-Order tree traversal: ");
		while(list.hasNext())
		{
			 System.out.print(list.next() +", ");
		}
		System.out.println();
		System.out.println("===================");
		
        /* In-Order tree traversal */
		ArrayList<Integer> inOrderList= bTree.inOrder(root);
		list =  inOrderList.listIterator();
		System.out.print("In-Order tree traversal: ");
		while(list.hasNext())
		{
			 System.out.print(list.next() +", ");
		}
		System.out.println();
		System.out.println("===================");
		
		/* Post-Order tree traversal */
		ArrayList<Integer> postOrderList= bTree.postOrder(root);
		list =  postOrderList.listIterator();
		System.out.print("Post-Order tree traversal: ");
		while(list.hasNext())
		{
			 System.out.print(list.next() +", ");
		}
		System.out.println();
		System.out.println("===================");
		/* level-Order tree traversal */
		ArrayList<ArrayList<Integer>> levelOrderList= bTree.levelOrder(root);
		list=levelOrderList.listIterator();
		
		System.out.print("level-Order tree traversal: ");
		while(list.hasNext())
		{
		 System.out.print(list.next() +", ");
		}
	
		
		
	}
}
