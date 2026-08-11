// Last updated: 11/08/2026, 14:13:59
class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder m = new StringBuilder();
        int cx =0;
        int cy =0;
        for(char c:s.toCharArray()){
            if(c==x) cx++;
            else if(c==y) cy++;
            else m.append(c);
        }
        return String.valueOf(y).repeat(cy)+m+String.valueOf(x).repeat(cx);
    }
}