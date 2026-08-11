// Last updated: 11/08/2026, 14:14:38
class Solution {
    public int maxConsistentColumns(int[][] grid, int limit) {
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];
        int a = -1;
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                boolean ok = true;
                for(int r=0;r<m;r++){
                    if(Math.abs(grid[r][i]- grid[r][j])>limit){
                        ok = false;
                        break;
                    }
                }
                if(ok){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            a = Math.max(a,dp[i]);
        }
        return a;
    }
}