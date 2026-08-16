// Last updated: 16/08/2026, 09:06:06
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3        int ans=-1;
4        int min = Integer.MAX_VALUE;
5        for(int i=0;i<drones.length;i++){
6            int x = drones[i][0];
7            int y = drones[i][1];
8            int r = drones[i][2];
9            int dis = Math.abs(x-target[0])+Math.abs(y-target[1]);
10            if(dis<=r && dis<min){
11                min = dis;
12                ans=i;
13            }
14        }
15        return ans;
16    }
17}