// Last updated: 15/09/2026, 20:56:51
1import java.util.ArrayDeque;
2import java.util.Deque;
3
4class Solution {
5    public String removeDuplicateLetters(String s) {
6        int[] lastIndex = new int[26];
7        for (int i = 0; i < s.length(); i++) {
8            lastIndex[s.charAt(i) - 'a'] = i;
9        }
10
11        boolean[] visited = new boolean[26];
12        Deque<Character> stack = new ArrayDeque<>();
13
14        for (int i = 0; i < s.length(); i++) {
15            char c = s.charAt(i);
16            if (visited[c - 'a']) continue;
17
18            while (!stack.isEmpty() && stack.peek() > c && lastIndex[stack.peek() - 'a'] > i) {
19                visited[stack.pop() - 'a'] = false;
20            }
21
22            stack.push(c);
23            visited[c - 'a'] = true;
24        }
25
26        StringBuilder sb = new StringBuilder();
27        while (!stack.isEmpty()) {
28            sb.append(stack.pop());
29        }
30
31        return sb.reverse().toString();
32    }
33}