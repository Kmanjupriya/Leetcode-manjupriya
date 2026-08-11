// Last updated: 11/08/2026, 14:14:06
class Solution {
    public int minimumCost(int[] nums, int k) {
        long m = 1000000007L;
        long r =k;
        long o =0;
        long a = 0;
        for(int x:nums){
            if(r<x){
                long n = (x-r+k-1L)/k;
                long f = o+1;
                long l = o+n;
                if((n&1)==0){
                    a = (a+((n/2)%m)*((f+l)%m))%m;  
                }
                else{
                a = (a+(n%m)*(((f+l)/2)%m))%m;
                }
            o+=n;
            r+=n*(long)k;
        }
        r-=x;
     }
      return (int)a;
    }
}