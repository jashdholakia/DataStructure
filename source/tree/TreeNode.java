package tree;

/**
 * @author Jash
 * This class basically provide the architecture for the tree.
 *
 */
public class TreeNode 
{
	public TreeNode leftNode;
	public TreeNode rightNode;
	public int data;
	
	public TreeNode(int data)
	{
		this.data=data;
		leftNode= null;
		rightNode=null;
	}
	
	
	public TreeNode getLeftNode() {
		return leftNode;
	}
	public void setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
	}
	public TreeNode getRightNode() {
		return rightNode;
	}
	public void setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
