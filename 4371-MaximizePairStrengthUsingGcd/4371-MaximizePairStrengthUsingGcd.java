// Last updated: 11/08/2026, 14:13:40
class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long a = nums[i], b = nums[j];
                long g = gcd(a,b);
                long s = (a*b)/(g*g);
                max = Math.max(max,s);
            }
        }
        return max;
    }
    public long gcd(long a,long b){
        return b==0? a:gcd(b,a%b);
    }
}