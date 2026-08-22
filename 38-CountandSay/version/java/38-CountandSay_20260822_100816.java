// Last updated: 22/08/2026, 10:08:16
1class Solution {
2    public ListNode deleteDuplicates(ListNode head) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5        ListNode prev = dummy;
6        
7        while (head != null) {
8           
9            if (head.next != null && head.val == head.next.val) {
10                while (head.next != null && head.val == head.next.val) {
11                    head = head.next;
12                }
13                prev.next = head.next;
14            } else {
15                prev = prev.next;
16            }
17            head = head.next;
18        }
19        
20        return dummy.next;
21    }
22}