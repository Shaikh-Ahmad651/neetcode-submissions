class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> res=new Stack<>();
        for (String k:tokens)
        {
            switch(k)
            {
                case "+":
                int n=res.pop();
                res.push(n+res.pop());
                break;

                case "-":
                n=res.pop();
                res.push(res.pop()-n);
                break;

                case "*":
                n=res.pop();
                res.push(n*res.pop());
                break;

                case "/":
                n=res.pop();
                res.push(res.pop()/n);
                break;

                default:
                res.push(Integer.parseInt(k));
            }
        }
        return res.peek();
    }
}
