// Last updated: 11/08/2026, 14:20:13
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        
        // If the number of unique frequencies matches the number of unique keys
        HashSet<Integer> uniqueCounts = new HashSet<>(counts.values());
        return counts.size() == uniqueCounts.size();
    }
}