/*�������� n����˳���ӡ���� 1 ������ n λʮ���������������� 3�����ӡ�� 1��2��3 һֱ������ 3 λ�� 999��
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