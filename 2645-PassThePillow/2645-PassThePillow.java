// Last updated: 11/08/2026, 14:16:36
class Solution {
    public int passThePillow(int n, int time) {
        int cycle  =time /(n-1);
        int a = time%(n-1);
        return cycle%2==0? a+1:n-a;
    }
}