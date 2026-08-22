// Last updated: 22/08/2026, 09:57:41
1class Solution {
2    public int splitArray(int[] nums, int k) {
3        long left = 0;
4        long right = 0;
5        
6        for (int num : nums) {
7            left = Math.max(left, num);
8            right += num;
9        }
10        
11        // Binary search on the answer
12        while (left < right) {
13            long mid = left + (right - left) / 2;
14            if (canSplit(nums, k, mid)) {
15                right = mid;
16            } else {
17                left = mid + 1;
18            }
19        }
20        
21        return (int) left;
22    }
23    
24    private boolean canSplit(int[] nums, int k, long maxSum) {
25        int count = 1;
26        long currentSum = 0;
27        
28        for (int num : nums) {
29            if (currentSum + num > maxSum) {
30                count++;
31                currentSum = num;
32            } else {
33                currentSum += num;
34            }
35        }
36        
37        return count <= k;
38    }
39}