/*����n & (n - 1) == 0
n�Ķ����Ʊ�ʾ���λΪ1������λȫΪ0��
n-1�Ķ��������λΪ0������λΪ1
*/
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}