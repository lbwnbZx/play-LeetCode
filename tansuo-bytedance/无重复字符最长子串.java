class Solution {
    public int lengthOfLongestSubstring(String s) {
        //哈希集合
        Set<Character> set = new HashSet<>();
        int len = s.length(),res = 0,right = -1;//res保存结果，right为右指针
        
        for(int i=0;i<len;i++){
            if(i != 0) set.remove(s.charAt(i-1));//i相当于左指针，左指针右移
            
            while(right + 1 < len && !set.contains(s.charAt(right+1))){
                set.add(s.charAt(right+1));
                right++;
            }
            
            res = Math.max(res, right-i+1);
            
        }
        return res;
        
    }
}