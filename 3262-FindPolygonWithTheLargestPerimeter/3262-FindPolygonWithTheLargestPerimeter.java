// Last updated: 11/08/2026, 14:14:59
public class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long totalSum = 0;
        
        for (int num : nums) {
            totalSum += num;
        }
        
        // Iterate backwards from the largest side
        for (int i = nums.length - 1; i >= 2; i--) {
            totalSum -= nums[i]; // totalSum is now the sum of all elements before index i
            if (totalSum > nums[i]) {
                return totalSum + nums[i];
            }
        }
        return -1;
    }
}