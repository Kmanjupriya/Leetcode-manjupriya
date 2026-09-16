// Last updated: 16/09/2026, 09:41:12
1class Solution {
2    public int mySqrt(int x) {
3       long i=0;
4       while(i*i<=x)
5         i++;
6        return (int)(i-1);
7    }
8}