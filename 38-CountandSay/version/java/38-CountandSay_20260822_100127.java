// Last updated: 22/08/2026, 10:01:27
1class Solution {
2    public ListNode swapPairs(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5        ListNode prev = dummy;   
6        while (prev.next != null && prev.next.next != null) {
7            ListNode first = prev.next;
8            ListNode second = prev.next.next;
9            first.next = second.next;
10            second.next = first;
11            prev.next = second;
12            prev = first;
13        }
14        
15        return dummy.next;
16    }
17}