// Last updated: 11/08/2026, 14:13:57
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] s = startTime.split(":");
        String[] e = endTime.split(":");
        int st = Integer.parseInt(s[0])*3600+Integer.parseInt(s[1])*60+Integer.parseInt(s[2]);
        int ed = Integer.parseInt(e[0])*3600+Integer.parseInt(e[1])*60+Integer.parseInt(e[2]);
        return ed - st;
    }
}