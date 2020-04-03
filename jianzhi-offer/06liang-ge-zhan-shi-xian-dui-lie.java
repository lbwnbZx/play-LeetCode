/*用两个栈实现队列
用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
java的栈操作太慢，可以用LinkList()代Stack()
*/
class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int len;
    public CQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
        //len=0;
    }
    
    public void appendTail(int value) {
        stack1.push(value);
        //len++;
    }
    
    public int deleteHead() {
        //if(len<=0) return -1;
        if(stack1.empty()&&stack2.empty()) return -1;
        if(!stack2.empty()){
            //len--;
            return stack2.pop();
        } 
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        //len--;
        return stack2.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */