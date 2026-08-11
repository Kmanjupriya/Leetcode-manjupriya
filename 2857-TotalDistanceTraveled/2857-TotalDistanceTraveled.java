// Last updated: 11/08/2026, 14:15:53
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int transfers = (mainTank - 1) / 4;        
        if (transfers > additionalTank) transfers = additionalTank; // manual min
        return (mainTank + transfers) * 10;
    }
}