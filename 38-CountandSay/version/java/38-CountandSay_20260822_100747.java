// Last updated: 22/08/2026, 10:07:47
1class Solution {
2    public ListNode rotateRight(ListNode head, int k) {
3        if (head == null || head.next == null || k == 0) return head;
4  
5        int length = 1;
6        ListNode tail = head;
7        while (tail.next != null) {
8            tail = tail.next;
9            length++;
10        }
11        tail.next = head;
12    
13        k = k % length;
14        int stepsToNewTail = length - k;
15        ListNode newTail = tail;
16        while (stepsToNewTail-- > 0) {
17            newTail = newTail.next;
18        }
19
20        ListNode newHead = newTail.next;
21        newTail.next = null;
22        
23        return newHead;
24    }
25}