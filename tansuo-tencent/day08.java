package �ճ�����;

import java.util.HashMap;
import java.util.Stack;

public class Solution09 {
    public static boolean isValid(String s){
        if(s.equals("")){
            return true;
        }

        Stack<Character>stack=new Stack<>();
        //�������滥��ƥ�������
        HashMap<Character,Character> hashMap=new HashMap<>();
        hashMap.put(')','(');
        hashMap.put('}','{');
        hashMap.put(']','[');

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(!hashMap.containsKey(c)){//���c����hashMap keyֵ��һ������c���ǣ�}]����c�ŵ�ջ��
                stack.push(c);
            }else{
                if(stack.size()==0){
                    return false;
                }
                Character temp=stack.pop();
                if(hashMap.get(c)!=temp){
                    return false;
                }

            }
        }
        return (stack.empty()? true : false);
    }

    public static void main(String[] args) {
        String s="{([])}";
        System.out.println(isValid(s));
    }
}
