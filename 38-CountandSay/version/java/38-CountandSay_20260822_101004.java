// Last updated: 22/08/2026, 10:10:04
1class Solution {
2    public void reorderList(ListNode head) {
3        if (head == null || head.next == null) return;
4        ListNode slow = head, fast = head;
5        while (fast != null && fast.next != null) {
6            slow = slow.next;
7            fast = fast.next.next;
8        }
9        
10        // 2. Reverse second half of the list
11        ListNode prev = null, curr = slow.next;
12        slow.next = null;
13        while (curr != null) {
14            ListNode nextTemp = curr.next;
15            curr.next = prev;
16            prev = curr;
17            curr = nextTemp;
18        }
19        ListNode first = head, second = prev;
20        while (second != null) {
21            ListNode tmp1 = first.next;
22            ListNode tmp2 = second.next;
23            
24            first.next = second;
25            second.next = tmp1;
26            
27            first = tmp1;
28            second = tmp2;
29        }
30    }
31}