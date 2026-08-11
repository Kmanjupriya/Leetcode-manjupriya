// Last updated: 11/08/2026, 14:13:41
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
    int count=0;
    public int countDominantNodes(TreeNode root) {
        dfs(root);
        return count;
    }
    private int dfs(TreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        int lm = dfs(node.left);
        int rm = dfs(node.right);
        int mv = Math.max(node.val,Math.max(lm,rm));
        if(node.val==mv){
            count++;
        }
        return mv;
    }
}