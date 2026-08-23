// Last updated: 23/08/2026, 08:52:56
1class Solution {
2    public int longestSubarray(int[] nums, int k) {
3        Map<Integer,Integer> map = new HashMap<>();
4        int l =0, ml =0;
5        for(int r=0;r<nums.length;r++){
6            addFactors(nums[r],map,1);
7            while(map.size()>k){
8                addFactors(nums[l++],map,-1);
9            }
10            ml = Math.max(ml,r-l+1);
11        }
12     return ml;
13    }
14    private void addFactors(int n, Map<Integer,Integer> map,int delta){
15        for(int i=2;i*i<=n;i++){
16            if(n%i==0){
17                map.put(i,map.getOrDefault(i,0)+delta);
18                if(map.get(i)==0) map.remove(i);
19                while(n%i==0) n/=i;
20            }
21        }
22        if(n>1){
23            map.put(n,map.getOrDefault(n,0)+delta);
24            if(map.get(n)==0) map.remove(n);
25        }
26    }
27}