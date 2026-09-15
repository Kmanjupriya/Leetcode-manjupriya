// Last updated: 15/09/2026, 20:46:21
1class StockSpanner {
2    private Stack<int[]> stack; // Stores pairs of {price, span}
3
4    public StockSpanner() {
5        stack = new Stack<>();
6    }
7
8    public int next(int price) {
9        int span = 1;
10        while (!stack.isEmpty() && stack.peek()[0] <= price) {
11            span += stack.pop()[1];
12        }
13        stack.push(new int[]{price, span});
14        return span;
15    }
16}