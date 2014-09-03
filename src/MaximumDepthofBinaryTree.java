/**
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest 
 * path from the root node down to the farthest leaf node.
 * 
 * answer: ������,DFS
 *
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}
    	int left = maxDepth(root.left);
    	int right = maxDepth(root.right);
    	return Math.max(left, right)+1;
    }
}
