package �ճ�����;

public class Solution11 {
    public static String reverseWords(String s) {
       String str[]=s.split(" ");//���տո��и��ַ���
       StringBuffer sb=new StringBuffer();//ʹ�����е�reverse����
       for(int i=0;i<str.length;i++){
           sb.append(new StringBuffer(str[i]).reverse().toString()+" ");
       }
       return sb.toString().trim();//�������ַ���������һ���ո�

    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
