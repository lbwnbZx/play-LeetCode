/*调用 min、push 及 pop 的时间复杂度都是 O(1)
将min()的时间复杂度降为O(1)，需要借助辅助栈
栈A用来实现栈的基本功能
栈 A 中的最小元素始终对应栈 B 的栈顶元素，即 min() 函数只需返回栈 B 的栈顶元素即可*/
class MinStack {

    /** initialize your data structure here. */
    Stack <Integer> A,B;
    public MinStack() {
        A=new Stack<>();
        B=new Stack<>();
    }
    
    public void push(int x) {
        A.add(x);
        if(B.empty()||B.peek()>=x) B.add(x);//peek 不改变栈的值(不删除栈顶的值)，pop会把栈顶的值删除。
    }
    
    public void pop() {
        if(A.pop().equals(B.peek()))  B.pop();
    }
    
    public int top() {
        return A.peek();
    }
    
    public int min() {
        return B.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */