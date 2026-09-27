// Last updated: 27/09/2026, 09:04:03
1class Solution {
2    public int maxEqualAdjacentPairs(int[] nums) {
3        int n= nums.length;
4
5        int base=0;
6        Map<Long,Integer> pc=new HashMap<>();
7        for(int i=0;i<n-1;i++){
8            int a = nums[i],b=nums[i+1];
9            if(a==b){
10                base++;
11            }
12            else{
13                int lo = Math.min(a,b),hi=Math.max(a,b);
14                long key =((long)lo<<32)|(hi&0xffffffffL);
15                pc.merge(key,1,Integer::sum);
16            }
17        }
18        int best=0;
19        for(int v:pc.values()) best=Math.max(best,v);
20        return base+best;
21    }
22}