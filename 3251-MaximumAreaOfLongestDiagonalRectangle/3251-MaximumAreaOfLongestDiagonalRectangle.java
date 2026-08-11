// Last updated: 11/08/2026, 14:15:03
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiagonalSq = 0;
        int maxArea = 0;
        
        for (int[] rect : dimensions) {
            int l = rect[0], w = rect[1];
            int diagSq = l * l + w * w;
            int area = l * w;
            
            if (diagSq > maxDiagonalSq) {
                maxDiagonalSq = diagSq;
                maxArea = area;
            } else if (diagSq == maxDiagonalSq) {
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}