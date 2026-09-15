// Last updated: 15/09/2026, 20:50:39
1import java.util.*;
2
3class Solution {
4    private Map<Long, Integer> memo = new HashMap<>();
5
6    public int leastOpsExpressTarget(int x, int target) {
7        return dfs(x, (long) target) - 1;
8    }
9
10    private int dfs(int x, long target) {
11        if (target == 0) return 0;
12        if (target < x) {
13            // Option 1: add target times (x / x), cost is 2 per unit
14            // Option 2: subtract from x, cost is (x - target) * 2 + 1
15            return (int) Math.min(target * 2, (x - target) * 2 + 1);
16        }
17
18        if (memo.containsKey(target)) {
19            return memo.get(target);
20        }
21
22        long count = 0;
23        long prod = x;
24        while (prod * x <= target) {
25            prod *= x;
26            count++;
27        }
28
29        // Option 1: target - prod
30        int ans = (int) (count + 1) + dfs(x, target - prod);
31
32        // Option 2: prod * x - target (only if prod * x - target < target to prevent infinite recursion)
33        if (prod * x - target < target) {
34            ans = Math.min(ans, (int) (count + 2) + dfs(x, prod * x - target));
35        }
36
37        memo.put(target, ans);
38        return ans;
39    }
40}