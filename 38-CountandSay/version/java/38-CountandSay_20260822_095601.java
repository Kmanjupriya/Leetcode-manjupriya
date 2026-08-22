// Last updated: 22/08/2026, 09:56:01
1import java.util.HashSet;
2import java.util.Set;
3
4class Solution {
5    public boolean isValidSudoku(char[][] board) {
6        Set<String> seen = new HashSet<>();
7        
8        for (int i = 0; i < 9; i++) {
9            for (int j = 0; j < 9; j++) {
10                char val = board[i][j];
11                if (val != '.') {
12                    // Unique string keys for row, col, and 3x3 sub-box
13                    if (!seen.add(val + " in row " + i) ||
14                        !seen.add(val + " in col " + j) ||
15                        !seen.add(val + " in box " + i / 3 + "-" + j / 3)) {
16                        return false;
17                    }
18                }
19            }
20        }
21        return true;
22    }
23}