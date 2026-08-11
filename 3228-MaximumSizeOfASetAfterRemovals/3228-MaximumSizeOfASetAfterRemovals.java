// Last updated: 11/08/2026, 14:15:18
class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int x : nums1) set1.add(x);
        for (int x : nums2) set2.add(x);

        int common = 0;
        for (int x : set1) {
            if (set2.contains(x)) common++;
        }

        int n = nums1.length;
        int unique1 = set1.size() - common;
        int unique2 = set2.size() - common;

        int count1 = Math.min(unique1, n / 2);
        int count2 = Math.min(unique2, n / 2);

        int rem1 = n / 2 - count1;
        int rem2 = n / 2 - count2;

        return count1 + count2 + Math.min(common, rem1 + rem2);
    }
}