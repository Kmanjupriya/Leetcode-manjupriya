// Last updated: 11/08/2026, 14:14:21
class Solution {
    public int maxDistance(String moves) {
        int u=0,d=0,l=0,r=0,q=0;
        for(char ch: moves.toCharArray()){
            if(ch=='U') u++;
            else if(ch=='D') d++;
            else if(ch=='L') l++;
            else if(ch=='R') r++;
            else q++;
        }
        int v = Math.abs(u-d);
        int h = Math.abs(l-r);
        return v+h+q;
    }
}