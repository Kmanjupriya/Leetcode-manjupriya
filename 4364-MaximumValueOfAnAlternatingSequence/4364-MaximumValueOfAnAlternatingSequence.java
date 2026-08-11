// Last updated: 11/08/2026, 14:13:45
class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n<=1){
            return s;
        }
        long upStep = n/2;
        long downstep = upStep-1;
        return s + (upStep*m)-downstep;
    }
}