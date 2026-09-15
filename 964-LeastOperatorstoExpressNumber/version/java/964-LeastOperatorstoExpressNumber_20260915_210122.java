// Last updated: 15/09/2026, 21:01:22
1class Solution {
2    public int mySqrt(int x) {
3        if (x < 2) return x;
4        int left = 1, right = x / 2, ans = 0;
5        while (left <= right) {
6            int mid = left + (right - left) / 2;
7            if ((long) mid * mid <= x) {
8                ans = mid;
9                left = mid + 1;
10            } else {
11                right = mid - 1;
12            }
13        }
14        return ans;
15    }
16}