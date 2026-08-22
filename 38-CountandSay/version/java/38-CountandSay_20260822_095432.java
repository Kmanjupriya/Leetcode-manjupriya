// Last updated: 22/08/2026, 09:54:32
1import java.util.HashMap;
2import java.util.Map;
3import java.util.PriorityQueue;
4
5class Solution {
6    public int[] topKFrequent(int[] nums, int k) {
7        Map<Integer, Integer> countMap = new HashMap<>();
8        for (int num : nums) {
9            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
10        }
11        
12        // Min-heap based on frequencies
13        PriorityQueue<Integer> heap = new PriorityQueue<>(
14            (a, b) -> countMap.get(a) - countMap.get(b)
15        );
16        
17        for (int num : countMap.keySet()) {
18            heap.add(num);
19            if (heap.size() > k) {
20                heap.poll();
21            }
22        }
23        
24        int[] result = new int[k];
25        for (int i = 0; i < k; i++) {
26            result[i] = heap.poll();
27        }
28        return result;
29    }
30}