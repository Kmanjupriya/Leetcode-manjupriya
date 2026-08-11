// Last updated: 11/08/2026, 14:14:19
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        int n = nums.length;
        long totalSum = 0;
        for (int i = 0; i < k; i++) {
            long element = nums[n - 1 - i]; 
            long multiplier = Math.max(1, mul - i); 
            totalSum += element * multiplier;
        }
        return totalSum;
    }
}