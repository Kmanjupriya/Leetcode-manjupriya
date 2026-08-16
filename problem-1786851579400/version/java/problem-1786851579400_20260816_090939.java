// Last updated: 16/08/2026, 09:09:39
1class Solution {
2    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
3        int max = 0;
4        for(int light:lights){
5            max = Math.max(max,light);
6        }
7        int[][] vel = new int[][]{
8            lights,arrivalTime
9        };
10        int ans =0;
11        for(int time:arrivalTime){
12            int r = time%period;
13            if(r>=max){
14                ans = Math.max(ans,period-r);
15            }
16        }
17        return ans;
18    }
19}