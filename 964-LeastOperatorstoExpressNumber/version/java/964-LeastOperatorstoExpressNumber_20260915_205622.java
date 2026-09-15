// Last updated: 15/09/2026, 20:56:22
1import java.util.ArrayDeque;
2import java.util.Arrays;
3import java.util.Deque;
4
5class Solution {
6    public int[] nextGreaterElements(int[] nums) {
7        int n = nums.length;
8        int[] result = new int[n];
9        Arrays.fill(result, -1);
10        Deque<Integer> stack = new ArrayDeque<>();
11
12        for (int i = 0; i < 2 * n; i++) {
13            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
14                result[stack.pop()] = nums[i % n];
15            }
16            if (i < n) {
17                stack.push(i);
18            }
19        }
20
21        return result;
22    }
23}