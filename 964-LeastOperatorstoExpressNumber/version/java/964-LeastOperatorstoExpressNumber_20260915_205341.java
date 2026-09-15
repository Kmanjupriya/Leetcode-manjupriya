// Last updated: 15/09/2026, 20:53:41
1import java.util.Stack;
2
3class Solution {
4    public int calculate(String s) {
5        if (s == null || s.length() == 0) return 0;
6
7        int len = s.length();
8        Stack<Integer> stack = new Stack<>();
9        int currNum = 0;
10        char op = '+';
11
12        for (int i = 0; i < len; i++) {
13            char ch = s.charAt(i);
14            if (Character.isDigit(ch)) {
15                currNum = currNum * 10 + (ch - '0');
16            }
17            if ((!Character.isDigit(ch) && ch != ' ') || i == len - 1) {
18                if (op == '+') stack.push(currNum);
19                else if (op == '-') stack.push(-currNum);
20                else if (op == '*') stack.push(stack.pop() * currNum);
21                else if (op == '/') stack.push(stack.pop() / currNum);
22
23                op = ch;
24                currNum = 0;
25            }
26        }
27
28        int res = 0;
29        while (!stack.isEmpty()) {
30            res += stack.pop();
31        }
32        return res;
33    }
34}