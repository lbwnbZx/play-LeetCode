class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int j=s.length()-1,i=j;
        StringBuilder res = new StringBuilder();
        
        while(i>=0){
            while(i>=0 && s.charAt(i) !=' ') i--;//搜索首个空格
            res.append(s.substring(i+1,j+1)+" ");///substring  左闭右开
            
            while(i>=0 && s.charAt(i) ==' ') i--;//跳过单词间空格
            j=i;
        }
        
        return res.toString().trim();
      
            
        
    }
}