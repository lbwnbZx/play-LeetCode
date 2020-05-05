/*
//字符串切片
class Solution {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n,s.length())+s.substring(0,n);
    }
}
*/

//列表遍历拼接
class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res =new StringBuilder();
        for(int i = n;i<s.length();i++){
            res.append(s.charAt(i));
        }
        for(int i=0;i<n;i++){
            res.append(s.charAt(i));
        }
        return res.toString();
    }
}