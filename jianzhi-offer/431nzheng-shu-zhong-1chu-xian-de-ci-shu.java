class Solution {
    public int countDigitOne(int n) {
        return dfs(n);

    }
    private int dfs(int n){
        if(n<=0) return 0;
        String numStr = String.valueOf(n);
        int high = numStr.charAt(0)-'0';//两个char型相减等于ascII码之差， ‘1’ - ‘0’ = 0 最后需要的是int
        int pow = (int)Math.pow(10,numStr.length()-1);
        int last =n - high*pow;
        if(high == 1){
            /*最高位是1，如1234，此时pow为1000，那么结果由以下三部分组成：
            dfs(pow-1)代表从0-999中1 的个数
            1000~1234这个范围1的个数需要分为两部分：
                千分位是1的个数：千分位为1的个数刚好就是234+1 (last+1)，注意，这儿只看千分位，不看其他位
                其他位是1的个数：即是234中出现1的个数，为dfs(last)
            */
            return dfs(pow-1)+dfs(last)+last+1;
        }else{
            /*最高位不是1，如3234，high=3，pow=1000,last=234;
            可以将数字范围分成:
            1-999这部分的数字中1的个数为dfs(pow-1)
            1000-1999这部分数字中1 的个数为分为两部分：
                千分位是1 的个数为pow,注意，这儿只看千分位，不看其他位
                其他位是1 的个数：即999这部分中1 的个数： dfs(pow-1)
            2000-2999这个范围中1的个数为dfs(pow-1)
            3000-3234这个范围中1 的个数为dfs(last)
            
            */
            return dfs(pow-1)*high+dfs(last)+pow;
        }
    }
}