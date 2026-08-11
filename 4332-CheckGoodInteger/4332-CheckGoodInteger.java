// Last updated: 11/08/2026, 14:14:24
class Solution {
    public boolean checkGoodInteger(int n) {

        int dsum=0;
        int ps =0;
        while(n!=0){
            int temp = n%10;
            int sq = temp*temp;
            dsum+=temp;
            ps+=sq;
            n/=10;
        }
        int ans = ps-dsum;
        if(ans>=50)
             return true;
        else
            return false;
    }
}