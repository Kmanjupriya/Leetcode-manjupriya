// Last updated: 11/08/2026, 14:14:58
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Long> minPrefix = new HashMap<>();
        long currentPrefix = 0;
        long maxSum = Long.MIN_VALUE;

        for (int num : nums) {
            if (minPrefix.containsKey(num - k)) {
                maxSum = Math.max(maxSum, currentPrefix + num - minPrefix.get(num - k));
            }
            if (minPrefix.containsKey(num + k)) {
                maxSum = Math.max(maxSum, currentPrefix + num - minPrefix.get(num + k));
            }

            if (!minPrefix.containsKey(num) || currentPrefix < minPrefix.get(num)) {
                minPrefix.put(num, currentPrefix);
            }

            currentPrefix += num;
        }

        return maxSum == Long.MIN_VALUE ? 0 : maxSum;
    }
}