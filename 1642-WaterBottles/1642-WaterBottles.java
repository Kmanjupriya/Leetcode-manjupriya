// Last updated: 11/08/2026, 14:18:41
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int t = numBottles;
        int e=numBottles;
        while(e>=numExchange){
           int newB = e/numExchange;
           t+=newB;
           e=e%numExchange + newB;
        }
        return t;
    }
}