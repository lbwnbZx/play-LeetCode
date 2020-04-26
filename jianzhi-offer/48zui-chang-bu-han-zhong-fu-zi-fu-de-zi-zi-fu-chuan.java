//双指针
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> dic = new HashMap<>();
        int i=-1,res=0;
        //j遍历字符串
        for(int j=0;j<s.length();j++){
            //map中包含j所指的字符
            if(dic.containsKey(s.charAt(j))){
                //更新i
                i=Math.max(i,dic.get(s.charAt(j)));
            }
            dic.put(s.charAt(j),j);
            res=Math.max(res,(j-i));
        }
        return res;
    }
}