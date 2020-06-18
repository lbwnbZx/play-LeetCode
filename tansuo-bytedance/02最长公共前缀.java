class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
            
        String res = strs[0]; //将第一个字符串作为最长公共前缀，然后依次与其他字符串进行比较
        for(int i = 1;i < strs.length;i++){
            int j = 0 ;
            for(; j < res.length() && j < strs[i].length() ; j++){
                if(res.charAt(j) != strs[i].charAt(j))  break;                           
            }
            res = res.substring(0,j);
            if(res.equals("")) return res;
        }
        return res;
        
    }
}