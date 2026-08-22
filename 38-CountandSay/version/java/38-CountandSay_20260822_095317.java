// Last updated: 22/08/2026, 09:53:17
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
6        Map<Integer, Integer> map = new HashMap<>();
7        
8        // Store sums of pairs from nums1 and nums2
9        for (int a : nums1) {
10            for (int b : nums2) {
11                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
12            }
13        }
14        
15        int count = 0;
16        // Look for complement -(c + d) in the map
17        for (int c : nums3) {
18            for (int d : nums4) {
19                count += map.getOrDefault(-(c + d), 0);
20            }
21        }
22        
23        return count;
24    }
25}