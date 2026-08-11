// Last updated: 11/08/2026, 14:20:25

 class Solution {
    public int[] decompressRLElist(int[] nums) {
        // Step 1: Find total size of the generated array
        int size = 0;
        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }
        
        int[] result = new int[size];
        int index = 0;
        
        // Step 2: Fill the array
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            for (int j = 0; j < freq; j++) {
                result[index++] = val;
            }
        }
        return result;
    }
}