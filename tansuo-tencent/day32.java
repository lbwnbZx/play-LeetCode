/*恒有n & (n - 1) == 0
n的二进制表示最高位为1，其他位全为0，
n-1的二进制最高位为0，其他位为1
*/
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}