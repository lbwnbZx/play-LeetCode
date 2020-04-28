/*
//使用有序哈希表
class Solution {
    public char firstUniqChar(String s) {
        Map<Character,Boolean> map= new LinkedHashMap<>();
        char[] c = s.toCharArray();
        for(char tmp:c){
            map.put(tmp,!map.containsKey(tmp));
        }
        
        //entrySet是 键-值 对的集合，Set里面的类型是Map.Entry
        for(Map.Entry<Character,Boolean> tmp:map.entrySet()){
            if(tmp.getValue()) return tmp.getKey();
        }
        return ' ';
    }
}
*/

//使用普通哈希表
class Solution {
    public char firstUniqChar(String s) {
        Map<Character,Boolean> map= new HashMap<>();
        char[] c = s.toCharArray();
        for(char tmp : c){
            map.put(tmp,!map.containsKey(tmp));
        }
        for(char tmp : c){
            if(map.get(tmp)) return tmp;
        }
        return ' ';
    }
}