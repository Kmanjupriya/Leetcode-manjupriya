// Last updated: 11/08/2026, 14:20:29
import java.util.Stack;

class Solution {
    public int mctFromLeafValues(int[] arr) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MAX_VALUE);
        
        for (int num : arr) {
            while (stack.peek() <= num) {
                int mid = stack.pop();
                res += mid * Math.min(stack.peek(), num);
            }
            stack.push(num);
        }
        while (stack.size() > 2) {
            res += stack.pop() * stack.peek();
        }
        
        return res;
    }
}