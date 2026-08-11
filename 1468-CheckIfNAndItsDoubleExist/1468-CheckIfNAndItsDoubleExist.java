// Last updated: 11/08/2026, 14:19:31
import java.util.HashSet;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) {
            if (set.contains(2 * x) || (x % 2 == 0 && set.contains(x / 2))) return true;
            set.add(x);
        }
        return false;
    }
}