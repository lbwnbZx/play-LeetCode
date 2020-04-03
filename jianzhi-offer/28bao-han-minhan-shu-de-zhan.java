/*���� min��push �� pop ��ʱ�临�Ӷȶ��� O(1)
��min()��ʱ�临�ӶȽ�ΪO(1)����Ҫ��������ջ
ջA����ʵ��ջ�Ļ�������
ջ A �е���СԪ��ʼ�ն�Ӧջ B ��ջ��Ԫ�أ��� min() ����ֻ�践��ջ B ��ջ��Ԫ�ؼ���*/
class MinStack {

    /** initialize your data structure here. */
    Stack <Integer> A,B;
    public MinStack() {
        A=new Stack<>();
        B=new Stack<>();
    }
    
    public void push(int x) {
        A.add(x);
        if(B.empty()||B.peek()>=x) B.add(x);//peek ���ı�ջ��ֵ(��ɾ��ջ����ֵ)��pop���ջ����ֵɾ����
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