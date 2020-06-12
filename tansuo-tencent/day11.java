package �ճ�����;
//�����������ַ�����ʽ��ʾ�ķǸ����� num1 �� num2������ num1 �� num2 �ĳ˻������ǵĳ˻�Ҳ��ʾΪ�ַ�����ʽ��
public class Solution10 {
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int len1=num1.length();
        int len2=num2.length();
        int []arrayInt=new  int[len1+len2];//�洢������int���͵�ֵ
        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){
                int n1=num1.charAt(i)-'0';
                int n2=num2.charAt(j)-'0';
                arrayInt[i+j]+=n1*n2;

                //��Ҫ��λ
                if(arrayInt[i+j]>=10&&(i+j)!=0){
                    arrayInt[i+j-1]+=arrayInt[i+j]/10;
                    arrayInt[i+j]=arrayInt[i+j]%10;
                }

            }
        }
        StringBuffer sb=new StringBuffer();

        for (int i = 0; i <len1+len2-1; i++) {
            sb.append(arrayInt[i]);
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String s1="123";
        String s2="456";
        System.out.println(multiply(s1,s2));
    }
}
