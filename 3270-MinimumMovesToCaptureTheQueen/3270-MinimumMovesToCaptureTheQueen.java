// Last updated: 11/08/2026, 14:14:56
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        // Check if Rook can capture Queen in 1 move
        if (a == e && !(c == a && isBetween(b, d, f))) return 1;
        if (b == f && !(d == b && isBetween(a, c, e))) return 1;

        // Check if Bishop can capture Queen in 1 move
        if (Math.abs(c - e) == Math.abs(d - f)) {
            if (!(Math.abs(c - a) == Math.abs(d - b) && isBetween(c, a, e) && isBetween(d, b, f))) {
                return 1;
            }
        }

        return 2;
    }

    private boolean isBetween(int p1, int mid, int p2) {
        return mid > Math.min(p1, p2) && mid < Math.max(p1, p2);
    }
}