/*��ʵ��һ������������һ��������������������Ʊ�ʾ�� 1 �ĸ��������磬�� 9?��ʾ�ɶ������� 1001���� 2 λ�� 1����ˣ�������� 9����ú������ 2��
*/
/*
//��λ����
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res += n&1;
            n>>>=1;
        }
        return res;
    }
}
*/


/*����n&(n-1)
����n=10101100,��n-1=10101011
n&(n-1)=10101000
��ʱ��n&(n-1)������0,��res++,n=n&(n-1)
*/
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            res++;
            n=n&(n-1);
        }
        return res;
    }
}