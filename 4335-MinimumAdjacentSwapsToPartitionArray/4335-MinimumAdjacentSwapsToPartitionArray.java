// Last updated: 11/08/2026, 14:14:22
class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long ts =0;
        long cg2 =0;
        long cg3 =0;
        long MOD = 1__000_000_007L;
        for(int num: nums){
            if(num<a){
                ts=(ts+cg2+cg3)%MOD;
            }else if(num>=a && num<=b){
                ts=(ts+cg3)%MOD;
                cg2++;
            }else{
                cg3++;
            }
        }
        return (int) ts;
    }
}