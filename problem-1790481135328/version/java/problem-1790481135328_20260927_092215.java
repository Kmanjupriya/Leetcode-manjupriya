// Last updated: 27/09/2026, 09:22:15
1class Solution {
2    public int maxSubarray(int[] nums) {
3        int n=nums.length;
4        TreeMap<Integer,Integer> f = new TreeMap<>();
5        int l=0,ans=0;
6        for(int r=0;r<n;r++){
7            int x=nums[r];
8            while(violates(f,x)){
9                int lv=nums[l++];
10                f.merge(lv,-1,Integer::sum);
11                if(f.get(lv)==0)
12                f.remove(lv);
13            }
14            f.merge(x,1,Integer::sum);
15            ans=Math.max(ans,r-l+1);
16        }
17        return ans;
18        }
19    private boolean violates(TreeMap<Integer,Integer> f,int x){
20        for(int a:f.keySet()){
21            if(a>x) break;
22            int b=x-a;
23            if(b<a) break;
24            if(f.containsKey(b)&&(a!=b||f.get(a)>=2)) return true;
25        }
26        for(int b:f.keySet()){
27            if(f.containsKey(x+b)) return true;
28        }
29        return false;
30    } 
31}
32