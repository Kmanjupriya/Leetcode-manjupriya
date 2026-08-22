// Last updated: 22/08/2026, 09:45:51
1class Solution {
2    public String countAndSay(int n) {
3        String s = "1";
4        
5        for (int i = 1; i < n; i++) {
6            StringBuilder sb = new StringBuilder();
7            int count = 1;
8            
9            for (int j = 0; j < s.length(); j++) {
10                // If the next character is the same, increment count
11                if (j + 1 < s.length() && s.charAt(j) == s.charAt(j + 1)) {
12                    count++;
13                } else {
14                    // Append frequency and character, then reset count
15                    sb.append(count).append(s.charAt(j));
16                    count = 1;
17                }
18            }
19            s = sb.toString();
20        }
21        
22        return s;
23    }
24}