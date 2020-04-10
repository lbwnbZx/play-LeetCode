/*对于一个长度为3的字符串，其排列方式有3*2*1=6种排列方式
当字符串中存在重复元素时，排列方案中就会存在重复方案，需要在固定某位字符时保证该字符只在该位置固定一次，称为剪枝
递归简析：
    终止条件：x=len(c)-1，所有位已经固定好，最后一位只有一种情况，则将当前组合c转化为字符串并且加入到res中
    递归参数：当前固定位x
    递归体：初始化一个set，用来排除重复的字符，将第x位的字符分别和i∈[x,len(c)]的字符交换，并进入下层递归
        1.剪枝：c[i]在set中
        2.将 c[i] 加入 set? ，以便之后遇到重复字符时剪枝；
        3.固定字符：将c[i]和c[x]交换位置，固定c[i]为当前字符
        4.开启下层递归：调用dfs[x+1],即开始固定第x+1个字符
        5.还原交换： 将字符 c[i]和c[x] 交换（还原之前的交换）

*/
class Solution {
    List<String> res = new LinkedList<>();
    char[] c;
    public String[] permutation(String s) {
        c=s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);//toArray将列表List中的元素转导出为数组
    }

    private void dfs(int x){
        if(x == c.length-1){
            res.add(String.valueOf(c));
            return;
        } 
        HashSet<Character> set = new HashSet<>();
        for(int i=x;i<c.length;i++){
            if(set.contains(c[i]))  continue;//剪枝
            set.add(c[i]);
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    
    }

    private void swap(int a,int b){
        char tmp = c[a];
        c[a] = c[b];
        c[b] = tmp;
    }
}