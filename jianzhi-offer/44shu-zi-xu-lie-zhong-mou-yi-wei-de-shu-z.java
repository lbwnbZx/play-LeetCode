/*
���ڵ� n λ��Ӧ�����֣�������������ֶ�Ӧ����Ϊ target��Ȼ����������С�
    �����ҵ�������ֶ�Ӧ�����Ǽ�λ��
    Ȼ��ȷ�������Ӧ��������ֵ
    ���ȷ������ֵ�Ƕ�Ӧ��ֵ�е��ĸ�����.
*/

class Solution {
    public int findNthDigit(int n) {
        if(n < 10) return n;
        int i = 1;
        //��ѭ����ɺ�i-1��ʾΪ��λ����n-1��ʾ��Ҫ�Ҷ��ٸ�
        while(n > i * (Math.pow(10,i-1)) * 9 ){
            n -= i * Math.pow(10,i-1) * 9;
            i++;
        }
        char []result = String.valueOf((int)Math.pow(10,i-1)+(n-1)/i).toCharArray();//toCharArray���ַ���תΪ�ַ�����
        int value = result[(n-1)%i]-'0';    //(n-1)%λ�� �ó�����Ҫ�ĵ�xλ����
        return value;

    }
}