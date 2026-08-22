// Last updated: 22/08/2026, 10:15:58
1public class Solution {
2    public ListNode detectCycle(ListNode head) {
3        if (head == null || head.next == null) return null;
4
5        ListNode slow = head;
6        ListNode fast = head;
7
8        // Step 1: Detect if a cycle exists
9        while (fast != null && fast.next != null) {
10            slow = slow.next;
11            fast = fast.next.next;
12
13            if (slow == fast) {
14                // Step 2: Find cycle start position
15                ListNode pointer = head;
16                while (pointer != slow) {
17                    pointer = pointer.next;
18                    slow = slow.next;
19                }
20                return pointer;
21            }
22        }
23
24        return null;
25    }
26}