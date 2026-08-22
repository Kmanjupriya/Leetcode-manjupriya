// Last updated: 22/08/2026, 10:19:02
1import java.util.HashMap;
2import java.util.Map;
3
4class LRUCache {
5    private class Node {
6        int key, value;
7        Node prev, next;
8        
9        Node(int key, int value) {
10            this.key = key;
11            this.value = value;
12        }
13    }
14
15    private final int capacity;
16    private final Map<Integer, Node> map;
17    private final Node head, tail; // Dummy boundary nodes
18
19    public LRUCache(int capacity) {
20        this.capacity = capacity;
21        this.map = new HashMap<>();
22        
23        // Initialize dummy head and tail to avoid edge-case checks
24        this.head = new Node(0, 0);
25        this.tail = new Node(0, 0);
26        head.next = tail;
27        tail.prev = head;
28    }
29
30    public int get(int key) {
31        if (!map.containsKey(key)) {
32            return -1;
33        }
34        Node node = map.get(key);
35        remove(node);
36        insertAtHead(node);
37        return node.value;
38    }
39
40    public void put(int key, int value) {
41        if (map.containsKey(key)) {
42            remove(map.get(key));
43        } else if (map.size() == capacity) {
44            // Evict least recently used (node right before dummy tail)
45            map.remove(tail.prev.key);
46            remove(tail.prev);
47        }
48        
49        Node newNode = new Node(key, value);
50        insertAtHead(newNode);
51        map.put(key, newNode);
52    }
53
54    // Helper: Remove node from doubly linked list
55    private void remove(Node node) {
56        node.prev.next = node.next;
57        node.next.prev = node.prev;
58    }
59
60    private void insertAtHead(Node node) {
61        node.next = head.next;
62        node.next.prev = node;
63        head.next = node;
64        node.prev = head;
65    }
66}