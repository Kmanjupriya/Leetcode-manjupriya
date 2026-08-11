// Last updated: 11/08/2026, 14:14:40
class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        return Math.max(solve(nums, k, true), solve(nums, k, false));
    }
    private long solve(int[] nums, int k, boolean isMultiply) {
        int n = nums.length;
        long dp0 = nums[0];
        long dp1 = isMultiply ? (long) nums[0] * k : (long) nums[0] / k;
        long dp2 = Long.MIN_VALUE / 2; 
        long maxSum = Math.max(dp0, dp1);
        
        for (int i = 1; i < n; i++) {
            long x = nums[i];
            long transformedX = isMultiply ? x * k : x / k;
            dp2 = Math.max(dp1 + x, dp2 + x);
            dp1 = Math.max(transformedX, Math.max(dp0 + transformedX, dp1 + transformedX));
            dp0 = Math.max(x, dp0 + x);
            maxSum = Math.max(maxSum, Math.max(dp0, Math.max(dp1, dp2)));
        }
        return maxSum;
    }
}