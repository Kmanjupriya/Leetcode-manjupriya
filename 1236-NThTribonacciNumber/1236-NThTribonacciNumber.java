// Last updated: 11/08/2026, 14:20:37
class Solution {
    public int tribonacci(int n) {
        int n1=0;
        int n2=1;
        int n3=1;
        int n4=0;
        if(n==0||n==1) return n;
        else if (n==2) return 1;
        for(int i=3;i<=n;i++){
            n4=n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=n4;
        }
        return n4;
        
    }
}