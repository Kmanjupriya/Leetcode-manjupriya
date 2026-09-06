// Last updated: 06/09/2026, 08:44:45
1class Solution {
2    public int countGoodRotations(int[] nums) {
3        int n = nums.length;
4        int h = n/2;
5        int[] pel = nums;
6        long t =0;
7        for(int x:nums){
8            t+=x;
9        }
10        long fh=0;
11        for(int i=0;i<h;i++){
12            fh+=nums[i];
13        }
14        int ans=0;
15        for(int st =0;st<n;st++){
16            long sh=t-fh;
17            if(fh>sh){
18                ans++;
19            }
20            fh-=nums[st];
21            fh+=nums[(st+h)%n];
22        }
23        return ans;
24    }
25}