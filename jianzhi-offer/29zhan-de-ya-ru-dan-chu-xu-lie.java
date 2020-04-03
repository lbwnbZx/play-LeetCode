class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        int index=0;
        for(int i=0,len=pushed.length;i<len;i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty()&&index<len&&stack.peek()==popped[index]){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}