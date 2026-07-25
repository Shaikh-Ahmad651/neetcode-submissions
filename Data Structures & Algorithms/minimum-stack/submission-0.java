class MinStack {
    private Stack<Integer>mini;
    private Stack<Integer>minini;

    public MinStack() {
        mini= new Stack<>();
        minini=new Stack<>();
    }
    
    public void push(int val) {
        mini.push(val);
        if(minini.isEmpty()){
            minini.push(val);
        }
        else if(minini.peek() >val)
        {
            minini.push(val);
        }
        else{
            
            minini.push(minini.peek());
        }
    }
    
    public void pop() {
        mini.pop();
        minini.pop();
    }
    
    public int top() {
        return mini.peek();
    }
    
    public int getMin() {
        return minini.peek();
    }
}
