// Last updated: 22/08/2026, 10:03:02
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        if (head == null || left == right) return head;
4        
5        ListNode dummy = new ListNode(0);
6        dummy.next = head;
7        ListNode prev = dummy;
8        
9        // Move prev to the node just before 'left' position
10        for (int i = 0; i < left - 1; i++) {
11            prev = prev.next;
12        }
13        
14        ListNode curr = prev.next;
15        // In-place head-pointer swapping strategy
16        for (int i = 0; i < right - left; i++) {
17            ListNode nextTemp = curr.next;
18            curr.next = nextTemp.next;
19            nextTemp.next = prev.next;
20            prev.next = nextTemp;
21        }
22        
23        return dummy.next;
24    }
25}