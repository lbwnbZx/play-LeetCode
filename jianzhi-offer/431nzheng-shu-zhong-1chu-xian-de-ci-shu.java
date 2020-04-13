class Solution {
    public int countDigitOne(int n) {
        return dfs(n);

    }
    private int dfs(int n){
        if(n<=0) return 0;
        String numStr = String.valueOf(n);
        int high = numStr.charAt(0)-'0';//����char���������ascII��֮� ��1�� - ��0�� = 0 �����Ҫ����int
        int pow = (int)Math.pow(10,numStr.length()-1);
        int last =n - high*pow;
        if(high == 1){
            /*���λ��1����1234����ʱpowΪ1000����ô�����������������ɣ�
            dfs(pow-1)�����0-999��1 �ĸ���
            1000~1234�����Χ1�ĸ�����Ҫ��Ϊ�����֣�
                ǧ��λ��1�ĸ�����ǧ��λΪ1�ĸ����պþ���234+1 (last+1)��ע�⣬���ֻ��ǧ��λ����������λ
                ����λ��1�ĸ���������234�г���1�ĸ�����Ϊdfs(last)
            */
            return dfs(pow-1)+dfs(last)+last+1;
        }else{
            /*���λ����1����3234��high=3��pow=1000,last=234;
            ���Խ����ַ�Χ�ֳ�:
            1-999�ⲿ�ֵ�������1�ĸ���Ϊdfs(pow-1)
            1000-1999�ⲿ��������1 �ĸ���Ϊ��Ϊ�����֣�
                ǧ��λ��1 �ĸ���Ϊpow,ע�⣬���ֻ��ǧ��λ����������λ
                ����λ��1 �ĸ�������999�ⲿ����1 �ĸ����� dfs(pow-1)
            2000-2999�����Χ��1�ĸ���Ϊdfs(pow-1)
            3000-3234�����Χ��1 �ĸ���Ϊdfs(last)
            
            */
            return dfs(pow-1)*high+dfs(last)+pow;
        }
    }
}