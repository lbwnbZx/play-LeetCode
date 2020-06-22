class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] str = path.split("/");
        
        for(String s: str){
            //如果数组非空，且访问到的是“..”，则说明要返回上一级，要将当前元素出栈
            if(s.equals("..")){
               if(!stack.isEmpty()) stack.pop();//出栈，返回上一级
            }else if(!s.equals("")&&!s.equals(".")) stack.push(s);//不是“.”和为空的情况下表示路径，入栈
            
        }
        
        if(stack.isEmpty()) return "/";
        
        StringBuilder sb =new StringBuilder();
        
        for(int i=0;i<stack.size();i++){
            sb.append("/"+stack.get(i));
        }
        
        return sb.toString();
    }
}