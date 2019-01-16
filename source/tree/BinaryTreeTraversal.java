package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * This class contains traversal logic for BinaryTree(PreOrder, PostOrder, InOrder)
 * @author Jash
 *                       1
 *                      / \
 *                     2   3
 *                    /\   /\
 *                   4  5  6 7
 */
public class BinaryTreeTraversal 
{
	
	/**
	 * This method is for preOrder traversal i.e. DLR (Root, Left tree, right tree).
	 * @param root node
	 * @return
	 */
	public ArrayList<Integer> preOrder(TreeNode root)
	{
		ArrayList<Integer> result= new ArrayList<>();
		
		if(root==null)
			return result;
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);  //initial  root node into stack. 1
		while(!stack.empty())
		{
			TreeNode temp= stack.pop(); // |1|; |2| ; |4| ; |5|; |3|
			result.add(temp.data);//1 ; 2 ; 4 ; 5; 3;6 ;7 =>output
			
			if(temp.rightNode!=null)
				stack.push(temp.rightNode);//3 ; 3-5 ; - ; - ;
			if(temp.leftNode!=null)
				stack.push(temp.leftNode);	//3-2;3-5-4 (Top) ; 3-5 ; 3
		}
		return result;
	}
	
	/**
	 * This method is for inOrder traversal i.e. LRD
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> inOrder(TreeNode root)
	{
		ArrayList<Integer> result= new ArrayList<>();
		if(root== null)
			return result;
		Stack<TreeNode> stack = new Stack<>();
		boolean done=false;
		TreeNode currentNode= root; // 1
		while(!done)
		{
			if(currentNode!=null)
			{
				stack.push(currentNode);// |1| ; |1-2|; |1-2-4|; |1-5|; |3|; |3-6|; |7|
				currentNode= currentNode.leftNode; // 2 ; 4 ; null; null; 6; null; null
			}
			else
			{
				if(stack.isEmpty())
					done=true;
				else
				{
					currentNode=stack.pop(); // 4; 2; 5; 1; 6; 3;7
					result.add(currentNode.data); //4 - 2 - 5 - 1 - 6 - 3 - 7  =>o/p
					currentNode=currentNode.rightNode;//null ; 5; null; 3; null; 7
				}
			}
		}
		
		return result;
	}
	
	/**
	 * This method is for postOrder traversal i.e. LRD
	 * @param root
	 * @return
	 */
	public ArrayList<Integer> postOrder(TreeNode root)
	{
		ArrayList<Integer> result = new ArrayList<>();
		if(root == null)
			return result;
		Stack<TreeNode>stack = new Stack<>();
		stack.push(root);// 1
		TreeNode prevNode=null;
		while(!stack.isEmpty())
		{
			TreeNode curr =stack.peek(); // 1; 2 ; 4; 2; 5 ; 5; 2 ; 1 ; 3 ; 6 ; 6 ;3; 7; 3 ;3;3 
			if(prevNode==null || prevNode.leftNode==curr || prevNode.rightNode==curr)
			{
				if(curr.leftNode!=null)
					stack.push(curr.leftNode); // |1-2| ; |1-2-4|; |1-2| ;|1-3-6|; |1-3-7|
				else if(curr.rightNode!=null)
					stack.push(curr.rightNode);
			}
			else if(curr.leftNode==prevNode)
			{
				if(curr.rightNode!=null)
					stack.push(curr.rightNode);// |1-2-5| ; |1-3|;|1-3-7|
			}
			else
			{
				result.add(curr.data);// 4 - 5 - 2  - 6 - 7 - 3 - 1  =>o/p
				stack.pop(); // |1-2|; |1-2|; |1| ; |1-3|; |1-3|; |1|; |-|
			}
			prevNode=curr; // 1; 2; 4;2; 5; 5; 2; 1; 3; 6; 6; 3; 7; 3; 3
		}
		return result;
	}
	
	/**
	 * This method is for level traversing ; root= level 0
	 * @param root
	 * @return
	 */
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root)
	{
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		ArrayList<Integer> curr = new ArrayList<>();
		if(root==null)
			return result;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		queue.offer(null);
		
		while(!queue.isEmpty())
		{
			TreeNode temp =queue.poll(); //1 ; null;2;3;null;4;5;6;7;null
			if(temp!=null)
			{
				curr.add(temp.data);//1-2-3-4-5-6-7
				if(temp.leftNode!=null)
					queue.offer(temp.leftNode);//1;null;2;4;6
				if(temp.rightNode!=null)
					queue.offer(temp.rightNode);//1; null; 2;3;4;5;6;7
				
			}
			else
			{
				ArrayList<Integer>c_curr = new ArrayList<>(curr);
				result.add(c_curr); //1-2-3-4-5-6-7
				curr.clear();// clear the list to avoid duplicate entry.
				
				// completion of level.
				if(!queue.isEmpty())
					queue.offer(null); //2-3-null; 4-5-6-7-null
			}
		}
		return result;
	}

}
