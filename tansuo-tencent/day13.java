package 日常测试;

public class Solution11 {
    public static String reverseWords(String s) {
       String str[]=s.split(" ");//按照空格切割字符串
       StringBuffer sb=new StringBuffer();//使用其中的reverse方法
       for(int i=0;i<str.length;i++){
           sb.append(new StringBuffer(str[i]).reverse().toString()+" ");
       }
       return sb.toString().trim();//最后会在字符串后面多出一个空格

    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
