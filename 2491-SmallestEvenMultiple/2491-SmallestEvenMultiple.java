// Last updated: 11/08/2026, 14:16:55
class Solution {
    public int smallestEvenMultiple(int n) {
        return(n%2==0||n==0)? n:n*2;
    }
}