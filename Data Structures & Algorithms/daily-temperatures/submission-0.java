class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> elt = new Stack<>();
        Stack<Integer> inds = new Stack<>();
        int n = temperatures.length;
        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!elt.isEmpty() && elt.peek() < temperatures[i]) {
                elt.pop();
                res[inds.peek()] = i - inds.pop();
            }

            elt.push(temperatures[i]);
            inds.push(i);
        }

        return res;
    }
}