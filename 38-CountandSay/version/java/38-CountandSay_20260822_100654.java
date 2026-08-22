// Last updated: 22/08/2026, 10:06:54
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        if (head == null || head.next == null || k == 0) return head;
4        
5        // 1. Compute length and connect tail to head to form a ring
6        int length = 1;
7        ListNode tail = head;
8        while (tail.next != null) {
9            tail = tail.next;
10            length++;
11        }
12        tail.next = head;
13        
14        // 2. Find the new tail position
15        k = k % length;
16        int stepsToNewTail = length - k;
17        ListNode newTail = tail;
18        while (stepsToNewTail-- > 0) {
19            newTail = newTail.next;
20        }
21        
22        // 3. Break the ring
23        ListNode newHead = newTail.next;
24        newTail.next = null;
25        
26        return newHead;
27    }
28}