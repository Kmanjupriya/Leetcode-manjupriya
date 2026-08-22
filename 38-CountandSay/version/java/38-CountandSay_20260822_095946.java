// Last updated: 22/08/2026, 09:59:46
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5        ListNode fast = dummy;
6        ListNode slow = dummy;
7        for (int i = 0; i <= n; i++) {
8            fast = fast.next;
9        }
10
11        while (fast != null) {
12            fast = fast.next;
13            slow = slow.next;
14        }
15  
16        slow.next = slow.next.next;
17        
18        return dummy.next;
19    }
20}