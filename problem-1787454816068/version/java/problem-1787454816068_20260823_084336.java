// Last updated: 23/08/2026, 08:43:36
1class Solution {
2    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
3        List<List<Integer>> ans = new ArrayList<>();
4        long next = lower;
5        Arrays.sort(nums);
6        for(int x:nums){
7            if(x<next) continue;
8            if(x>upper) break;
9            if(x> next){
10                ans.add(Arrays.asList((int) next, x-1));
11            }
12            next =(long)x+1;
13        }
14        if(next<=upper){
15            ans.add(Arrays.asList((int) next,upper));
16        }
17        return ans;
18    }
19}