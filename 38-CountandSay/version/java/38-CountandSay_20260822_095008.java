// Last updated: 22/08/2026, 09:50:08
1import java.util.Arrays;
2
3class Solution {
4    public int sumDistance(int[] nums, String s, int d) {
5        int n = nums.length;
6        long[] pos = new long[n];
7        for (int i = 0; i < n; i++) {
8            if (s.charAt(i) == 'R') {
9                pos[i] = (long) nums[i] + d;
10            } else {
11                pos[i] = (long) nums[i] - d;
12            }
13        }
14        Arrays.sort(pos);
15        
16        long totalDistance = 0;
17        long prefixSum = 0;
18        long MOD = 1_000_000_007;
19        for (int i = 0; i < n; i++) {
20            long currentContribution = ((long) i * pos[i] - prefixSum) % MOD;
21            totalDistance = (totalDistance + currentContribution) % MOD;
22            prefixSum = (prefixSum + pos[i]) % MOD;
23        }
24        
25        return (int) totalDistance;
26    }
27}