// Last updated: 15/09/2026, 21:07:50
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    private int maxSum = Integer.MIN_VALUE;
18
19    public int maxPathSum(TreeNode root) {
20        dfs(root);
21        return maxSum;
22    }
23
24    private int dfs(TreeNode root) {
25        if (root == null) return 0;
26
27        int leftGain = Math.max(dfs(root.left), 0);
28        int rightGain = Math.max(dfs(root.right), 0);
29
30        maxSum = Math.max(maxSum, root.val + leftGain + rightGain);
31
32        return root.val + Math.max(leftGain, rightGain);
33    }
34}