class Solution {
   public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        if(len==0){
            return "";
        }
        String pre=strs[0];
        for(int i=1;i<len;i++){//控制是第几个字符串
            int j=0;
            for(;j<strs[i].length()&&j<pre.length();j++){//控制第i个字符串的第i个长度
                if(pre.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }

            pre=pre.substring(0,j);
            if(pre.equals("")){
                return pre;
            }
        }
        return pre;
    }
}