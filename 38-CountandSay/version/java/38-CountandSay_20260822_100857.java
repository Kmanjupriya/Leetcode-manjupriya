// Last updated: 22/08/2026, 10:08:57
1class Solution {
2    public ListNode partition(ListNode head, int x) {
3        ListNode beforeHead = new ListNode(0);
4        ListNode before = beforeHead;
5        ListNode afterHead = new ListNode(0);
6        ListNode after = afterHead;
7        
8        while (head != null) {
9            if (head.val < x) {
10                before.next = head;
11                before = before.next;
12            } else {
13                after.next = head;
14                after = after.next;
15            }
16            head = head.next;
17        }
18        
19        after.next = null;
20        before.next = afterHead.next;
21        
22        return beforeHead.next;
23    }
24}