// Last updated: 11/10/2026, 09:04:35
1class Solution {
2    public boolean threeFibonacciSum(int n) {
3        long a=0;
4        long b=1;
5        while(a+b<=n){
6            long c = a+b;
7            if(a+b+c==n){
8                return true;
9            }
10            a=b;
11            b=c;
12        }
13        return false;
14    }
15}