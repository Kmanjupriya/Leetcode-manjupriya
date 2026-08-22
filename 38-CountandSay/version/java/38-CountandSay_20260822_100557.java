// Last updated: 22/08/2026, 10:05:57
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        if (nums1.length > nums2.length) {
4            return findMedianSortedArrays(nums2, nums1);
5        }
6        int m = nums1.length;
7        int n = nums2.length;
8        int low = 0, high = m;
9        while (low <= high) {
10            int partitionX = low + (high - low) / 2;
11            int partitionY = (m + n + 1) / 2 - partitionX;
12            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
13            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
14            
15            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
16            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];
17            
18            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
19                if ((m + n) % 2 == 0) {
20                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
21                } else {
22                    return (double) Math.max(maxLeftX, maxLeftY);
23                }
24            } else if (maxLeftX > minRightY) {
25                high = partitionX - 1;
26            } else {
27                low = partitionX + 1;
28            }
29        }
30        
31        throw new IllegalArgumentException("Input arrays are not sorted.");
32    }
33}