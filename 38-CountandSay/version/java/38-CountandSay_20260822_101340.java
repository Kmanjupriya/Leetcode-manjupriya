// Last updated: 22/08/2026, 10:13:40
1import java.util.HashMap;
2import java.util.Map;
3
4class Solution {
5    public String minWindow(String s, String t) {
6        if (s.length() < t.length()) return "";
7
8        Map<Character, Integer> targetCount = new HashMap<>();
9        for (char c : t.toCharArray()) {
10            targetCount.put(c, targetCount.getOrDefault(c, 0) + 1);
11        }
12
13        int requiredMatches = targetCount.size();
14        int currentMatches = 0;
15
16        Map<Character, Integer> windowCount = new HashMap<>();
17        int left = 0, right = 0;
18        
19        int minLen = Integer.MAX_VALUE;
20        int minLeft = 0;
21
22        while (right < s.length()) {
23            char rightChar = s.charAt(right);
24            windowCount.put(rightChar, windowCount.getOrDefault(rightChar, 0) + 1);
25
26            if (targetCount.containsKey(rightChar) && 
27                windowCount.get(rightChar).intValue() == targetCount.get(rightChar).intValue()) {
28                currentMatches++;
29            }
30
31            while (left <= right && currentMatches == requiredMatches) {
32                char leftChar = s.charAt(left);
33
34                if (right - left + 1 < minLen) {
35                    minLen = right - left + 1;
36                    minLeft = left;
37                }
38
39                windowCount.put(leftChar, windowCount.get(leftChar) - 1);
40                if (targetCount.containsKey(leftChar) && 
41                    windowCount.get(leftChar) < targetCount.get(leftChar)) {
42                    currentMatches--;
43                }
44
45                left++;
46            }
47
48            right++;
49        }
50
51        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
52    }
53}