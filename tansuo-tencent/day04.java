package �ճ�����;
/*������ʵ��һ�� atoi ������ʹ���ܽ��ַ���ת����������
���ȣ��ú����������Ҫ�������õĿ�ͷ�ո��ַ���ֱ��Ѱ�ҵ���һ���ǿո���ַ�Ϊֹ��
������Ѱ�ҵ��ĵ�һ���ǿ��ַ�Ϊ�����߸���ʱ���򽫸÷�����֮���澡���ܶ���������������������Ϊ�������������ţ������һ���ǿ��ַ������֣�
��ֱ�ӽ�����֮�������������ַ�����������γ�������

���ַ���������Ч����������֮��Ҳ���ܻ���ڶ�����ַ�����Щ�ַ����Ա����ԣ����Ƕ��ں�����Ӧ�����Ӱ�졣
ע�⣺������ַ����еĵ�һ���ǿո��ַ�����һ����Ч�����ַ����ַ���Ϊ�ջ��ַ����������հ��ַ�ʱ������ĺ�������Ҫ����ת����
���κ�����£����������ܽ�����Ч��ת��ʱ���뷵�� 0��
�������ǵĻ���ֻ�ܴ洢 32 λ��С���з�����������ô����ֵ��ΧΪ [?231,  231 ? 1]�������ֵ���������Χ���뷵��  INT_MAX (231 ? 1) �� INT_MIN (?231) ��*/

public class Solution06 {
    /*public static int myAtoi(String str) {
        int value=0;//�洢ת��������
        int sign=0;//����  1��ʾ+��-1��ʾ-
        int len=str.length();
        int isNum=0;//�ж��Ƿ�Ϊ����λ


       // str=str.trim();//�������õĿ�ͷ�ո��ַ�    trimɾ���ַ�����β�Ŀո��ַ�
        if(str==null||len==0){
            return 0;
        }

        for(int i=0;i<len;++i){
          char  temp=str.charAt(i);
            if(isNum==0){
                if(temp==' ')//�ո�����
                    continue;
                else if(temp=='+'){
                    sign = 1;
                }else if(temp=='-'){
                    sign = -1;
                }else if(temp>='0' && temp<='9'){
                    value = value*10 + (int) (temp-'0');
                }else{//�������ֱ�ӷ���0
                    return 0;
                }
                isNum = 1;//��������ʶ��

            }else{
                if(temp>='0'&&temp<='9'){
                    //�ж�Խ������
                    if(sign==1 && (value>Integer.MAX_VALUE/10 || (value==Integer.MAX_VALUE/10 && temp>'7')))
                        return Integer.MAX_VALUE;
                    if(sign==-1 && (value>Integer.MAX_VALUE/10 || (value==Integer.MAX_VALUE/10 && temp>'8')))
                        return Integer.MIN_VALUE;
                    value=value*10+(int)(temp-'0');
                }else{//��������λ������
                    return sign*value;
                }
            }

        }
        return sign*value;
    }*/

    public static int myAtoi(String str) {
        int len = str.length();
        int isNum = 0;//�ж��Ƿ��������ʶ��
        int flag = 1;//�洢���������
        int ans = 0;//�洢���

        for(int i=0;i<len;i++){
            char temp = str.charAt(i);
            if(isNum==0){
                if(temp==' ')//�ո�����
                    continue;
                else if(temp=='+'){
                    flag = 1;
                }else if(temp=='-'){
                    flag = -1;
                }else if(temp>='0' && temp<='9'){
                    ans = ans*10 + (int) (temp-'0');
                }else{//�������ֱ�ӷ���0
                    return 0;
                }
                isNum = 1;//��������ʶ��
            }
            else{
                if(temp>='0' && temp<='9'){//��������ʶ���ʶ�𵽵������֣�����
                    //�ж�Խ�����
                    //�������ж�����Խ��
                    if(flag==1 && (ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && temp>'7')))
                        return Integer.MAX_VALUE;
                    //�������жϸ���Խ�硣
                    if(flag==-1 && (ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && temp>'8')))
                        return Integer.MIN_VALUE;
                    ans = ans*10 + (int) (temp-'0');
                }else{//ʶ��Ĳ������֣�ֱ�ӷ��ؽ��
                    return flag*ans;
                }
            }
        }
        return flag*ans;
    }

    public static void main(String[] args) {
        String str="      2132";
       /* System.out.println((int)Math.pow(2,31)-1);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE/10);*/
        System.out.println(myAtoi(str));
    }
}
