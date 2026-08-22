// Last updated: 22/08/2026, 09:46:46
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public String convert(String s, int numRows) {
6        if (numRows == 1 || numRows >= s.length()) {
7            return s;
8        }
9        
10        List<StringBuilder> rows = new ArrayList<>();
11        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
12            rows.add(new StringBuilder());
13        }
14        
15        int curRow = 0;
16        boolean goingDown = false;
17        
18        for (char c : s.toCharArray()) {
19            rows.get(curRow).append(c);
20            // Change direction at the boundaries
21            if (curRow == 0 || curRow == numRows - 1) {
22                goingDown = !goingDown;
23            }
24            curRow += goingDown ? 1 : -1;
25        }
26        
27        StringBuilder result = new StringBuilder();
28        for (StringBuilder row : rows) {
29            result.append(row);
30        }
31        
32        return result.toString();
33    }
34}