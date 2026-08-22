// Last updated: 22/08/2026, 10:19:29
1import java.util.HashMap;
2import java.util.Map;
3class LRUCache {
4    private class Node {
5        int key, value;
6        Node prev, next;
7        
8        Node(int key, int value) {
9            this.key = key;
10            this.value = value;
11        }
12    }
13    private final int capacity;
14    private final Map<Integer, Node> map;
15    private final Node head, tail; // Dummy boundary nodes
16
17    public LRUCache(int capacity) {
18        this.capacity = capacity;
19        this.map = new HashMap<>();
20        
21        // Initialize dummy head and tail to avoid edge-case checks
22        this.head = new Node(0, 0);
23        this.tail = new Node(0, 0);
24        head.next = tail;
25        tail.prev = head;
26    }
27    public int get(int key) {
28        if (!map.containsKey(key)) {
29            return -1;
30        }
31        Node node = map.get(key);
32        remove(node);
33        insertAtHead(node);
34        return node.value;
35    }
36    public void put(int key, int value) {
37        if (map.containsKey(key)) {
38            remove(map.get(key));
39        } else if (map.size() == capacity) {
40            map.remove(tail.prev.key);
41            remove(tail.prev);
42        }
43        
44        Node newNode = new Node(key, value);
45        insertAtHead(newNode);
46        map.put(key, newNode);
47    }
48
49  
50    private void remove(Node node) {
51        node.prev.next = node.next;
52        node.next.prev = node.prev;
53    }
54
55    private void insertAtHead(Node node) {
56        node.next = head.next;
57        node.next.prev = node;
58        head.next = node;
59        node.prev = head;
60    }
61}