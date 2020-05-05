class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int i=s.length()-1,j=i;
        StringBuilder res = new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i)!=' ') i--;//搜索单词
            res.append(s.substring(i+1,j+1)+' ');
            while(i>=0 && s.charAt(i) == ' ')i--;//跳过单词间的空格
            j=i;
        }
        return res.toString().trim();
    }
}