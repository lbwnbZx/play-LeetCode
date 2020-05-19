/*
位运算
无进位和  和   异或运算  规律相同
有进位和  和   与运算    规律相同（并且左移一位）

*/
class Solution {
    public int add(int a, int b) {
         while(b != 0) { // 当进位为 0 时跳出
            int c = (a & b) << 1;  // c = 进位
            a ^= b; // a = 非进位和
            b = c; // b = 进位
        }
        return a;
    }
}