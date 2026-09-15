// Last updated: 15/09/2026, 21:07:27
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length, n = matrix[0].length;
4        int left = 0, right = m * n - 1;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8            int val = matrix[mid / n][mid % n];
9            if (val == target) return true;
10            else if (val < target) left = mid + 1;
11            else right = mid - 1;
12        }
13        return false;
14    }
15}