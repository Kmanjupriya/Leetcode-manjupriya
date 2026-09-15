// Last updated: 15/09/2026, 21:02:29
1import java.util.Arrays;
2
3class Solution {
4    public int countCompleteSubstrings(String word, int k) {
5        int n = word.length();
6        int ans = 0, last = 0;
7
8        for (int i = 1; i <= n; i++) {
9            if (i == n || Math.abs(word.charAt(i) - word.charAt(i - 1)) > 2) {
10                ans += solveSegment(word.substring(last, i), k);
11                last = i;
12            }
13        }
14        return ans;
15    }
16
17    private int solveSegment(String s, int k) {
18        int count = 0;
19        int m = s.length();
20
21        for (int cnt = 1; cnt <= 26; cnt++) {
22            int len = cnt * k;
23            if (len > m) break;
24
25            int[] freq = new int[26];
26            for (int i = 0; i < m; i++) {
27                freq[s.charAt(i) - 'a']++;
28                if (i >= len) freq[s.charAt(i - len) - 'a']--;
29
30                if (i >= len - 1) {
31                    boolean valid = true;
32                    for (int f : freq) {
33                        if (f > 0 && f != k) {
34                            valid = false;
35                            break;
36                        }
37                    }
38                    if (valid) count++;
39                }
40            }
41        }
42        return count;
43    }
44}