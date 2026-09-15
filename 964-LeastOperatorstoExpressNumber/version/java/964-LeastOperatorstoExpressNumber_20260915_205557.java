// Last updated: 15/09/2026, 20:55:57
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class Solution {
5    public String removeKdigits(String num, int k) {
6        Deque<Character> stack = new ArrayDeque<>();
7
8        for (char c : num.toCharArray()) {
9            while (!stack.isEmpty() && k > 0 && stack.peekLast() > c) {
10                stack.removeLast();
11                k--;
12            }
13            stack.addLast(c);
14        }
15
16        while (k > 0 && !stack.isEmpty()) {
17            stack.removeLast();
18            k--;
19        }
20
21        StringBuilder sb = new StringBuilder();
22        while (!stack.isEmpty()) {
23            char c = stack.removeFirst();
24            if (sb.length() == 0 && c == '0') continue; // Skip leading zeros
25            sb.append(c);
26        }
27
28        return sb.length() == 0 ? "0" : sb.toString();
29    }
30}