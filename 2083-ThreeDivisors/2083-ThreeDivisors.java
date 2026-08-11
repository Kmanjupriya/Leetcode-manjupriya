// Last updated: 11/08/2026, 14:17:29
class Solution {
    public boolean isThree(int n) {
        int flag=0;
        int c=0;
        for(int i=1;i<=n;i++){
            int k = n%i;
            if(k==0){
                flag=1;
                c++;
            }
        }
        if(flag==1 && c==3)
          return true;
        else
          return false;
           
    }
}