// Last updated: 11/08/2026, 14:15:57
import java.util.Arrays;

class Solution {
    public int sumOfPower(int[] nums) {
        Arrays.sort(nums);
        long mod = 1_000_000_007;
        long totalPower = 0;
        long prefixSumOfMins = 0;
        
        for (int num : nums) {
            long val = num;
            long maxSquare = (val * val) % mod;
            totalPower = (totalPower + maxSquare * (prefixSumOfMins + val)) % mod;
            prefixSumOfMins = (prefixSumOfMins * 2 + val) % mod;
        }
        
        return (int) totalPower;
    }
}