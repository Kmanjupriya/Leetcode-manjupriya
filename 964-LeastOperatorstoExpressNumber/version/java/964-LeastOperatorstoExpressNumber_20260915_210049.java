// Last updated: 15/09/2026, 21:00:49
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3
4public class Solution extends VersionControl {
5    public int firstBadVersion(int n) {
6        int left = 1, right = n;
7        while (left < right) {
8            int mid = left + (right - left) / 2;
9            if (isBadVersion(mid)) right = mid;
10            else left = mid + 1;
11        }
12        return left;
13    }
14}