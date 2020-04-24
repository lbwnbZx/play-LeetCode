/*
对于第 n 位对应的数字，我们令这个数字对应的数为 target，然后分三步进行。
    首先找到这个数字对应的数是几位数
    然后确定这个对应的数的数值
    最后确定返回值是对应数值中的哪个数字.
*/

class Solution {
    public int findNthDigit(int n) {
        if(n < 10) return n;
        int i = 1;
        //此循环完成后，i-1表示为几位数，n-1表示还要找多少个
        while(n > i * (Math.pow(10,i-1)) * 9 ){
            n -= i * Math.pow(10,i-1) * 9;
            i++;
        }
        char []result = String.valueOf((int)Math.pow(10,i-1)+(n-1)/i).toCharArray();//toCharArray将字符串转为字符数组
        int value = result[(n-1)%i]-'0';    //(n-1)%位数 得出我们要的第x位的数
        return value;

    }
}