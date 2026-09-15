// Last updated: 15/09/2026, 21:03:39
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0, right = nums.length - 1;
4        while (left <= right) {
5            int mid = left + (right - left) / 2;
6            if (nums[mid] == target) return true;
7
8            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
9                left++;
10                right--;
11            } else if (nums[left] <= nums[mid]) {
12                if (nums[left] <= target && target < nums[mid]) right = mid - 1;
13                else left = mid + 1;
14            } else {
15                if (nums[mid] < target && target <= nums[right]) left = mid + 1;
16                else right = mid - 1;
17            }
18        }
19        return false;
20    }
21}