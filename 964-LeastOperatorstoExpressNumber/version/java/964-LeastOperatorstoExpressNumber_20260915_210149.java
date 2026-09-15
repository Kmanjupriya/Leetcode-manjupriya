// Last updated: 15/09/2026, 21:01:49
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4        while (left <= right) {
5            int mid = left + (right - left) / 2;
6            if (nums[mid] == target) return mid;
7
8            if (nums[left] <= nums[mid]) {
9                if (nums[left] <= target && target < nums[mid]) right = mid - 1;
10                else left = mid + 1;
11            } else {
12                if (nums[mid] < target && target <= nums[right]) left = mid + 1;
13                else right = mid - 1;
14            }
15        }
16        return -1;
17    }
18}