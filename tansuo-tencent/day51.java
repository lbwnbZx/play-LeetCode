/*栈A来实现栈的基本功能，栈B用来辅助实现min函数，B的栈顶元素始终对应栈A中的最小元素。

*/
class MinStack {
    
    Stack<Integer> A,B;
    
    /** initialize your data structure here. */
    public MinStack() {
        A=new Stack<>();
        B=new Stack<>();
        
    }
    
    public void push(int x) {
        A.add(x);
        if(B.empty()||B.peek()>=x) B.add(x);
    }
    
    public void pop() {
        if(!A.isEmpty()){
            int tmp = A.pop();
            if(B.peek().equals(tmp))  {
             B.pop();
   
            }        
        }
        
    }
    
    public int top() {
        return A.peek();
    }
    
    public int getMin() {
        return B.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */