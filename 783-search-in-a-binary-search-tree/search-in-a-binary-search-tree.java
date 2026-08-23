/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {

        // Base case: tree is empty
        if(root == null) {
            return null;
        }

        // Found the value
        if(root.val == val) {
            return root;
        }

        // Target is smaller → go left
        if(val < root.val) {
            return searchBST(root.left, val);
        }

        // Target is larger → go right
        return searchBST(root.right, val);
    }
}