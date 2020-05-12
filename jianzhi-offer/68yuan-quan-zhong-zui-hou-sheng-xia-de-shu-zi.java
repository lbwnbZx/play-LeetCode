// f(n,m)=(f(n-1,m)+m)% n  取余的n每次都减一
class Solution {
    public int lastRemaining(int n, int m) {
        int index = 0;//动态规划的思想，将f(n,m)用flag存储
        //最后只剩下一个数字的时候，它的下标为0  所以index = 0
        //最后一轮剩下两个人，所以从2开始倒推
        for(int i = 2;i <= n;i++){
            index = (index+m)%i;
        }
        return index;
    }
}