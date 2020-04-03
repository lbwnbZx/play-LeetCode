/*输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
*/
class Solution {
    public int[] printNumbers(int n) {
        int maxNum=(int)Math.pow(10,n)-1;
        int res[]=new int[maxNum];
        for(int i=0;i<maxNum;){
            res[i]=++i;
        }
        return res;

    }
}