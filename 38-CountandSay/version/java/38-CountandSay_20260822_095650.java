// Last updated: 22/08/2026, 09:56:50
1import java.util.ArrayList;
2import java.util.HashMap;
3import java.util.List;
4import java.util.Map;
5import java.util.Random;
6
7class RandomizedSet {
8    private List<Integer> list;
9    private Map<Integer, Integer> map;
10    private Random rand;
11
12    public RandomizedSet() {
13        list = new ArrayList<>();
14        map = new HashMap<>();
15        rand = new Random();
16    }
17    
18    public boolean insert(int val) {
19        if (map.containsKey(val)) return false;
20        map.put(val, list.size());
21        list.add(val);
22        return true;
23    }
24    
25    public boolean remove(int val) {
26        if (!map.containsKey(val)) return false;
27        
28        // Swap element with the last element in list to delete in O(1)
29        int index = map.get(val);
30        int lastElement = list.get(list.size() - 1);
31        
32        list.set(index, lastElement);
33        map.put(lastElement, index);
34        
35        list.remove(list.size() - 1);
36        map.remove(val);
37        return true;
38    }
39    
40    public int getRandom() {
41        return list.get(rand.nextInt(list.size()));
42    }
43}