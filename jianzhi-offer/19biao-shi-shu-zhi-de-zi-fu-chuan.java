/*
���ģ���Ч������ģʽֻ������
1. [A[.[B]][e|EC]] ����+100   -67.0  29.    3.14E5
2. .[B][e|EC]   ����.3=0.3     .4E6=400000
����A��C��������B����������[e|EC]��ʾ[eC]����[EC]
ԭ����A��ʱ�����û��B��û��A��ʱ��������B
*/
class Solution {
    //ɨ���ַ���������
    public int i=0;

    public boolean isNumber(String s) {
        if(s==null||s.length()==0) return false;
        //ȥ���ַ�������β���ַ�
        s=s.trim();

        //�ж��Ƿ���A; ͬʱ��B,C��ʼ��Ϊfalse
        boolean A=scanInteger(s),B=false,C=false;
        
        //�ж��Ƿ���B; ʹ������ʱҪȷ����Խ��
        if(i<s.length()&&s.charAt(i)=='.'){
            //������.Bʱ, ��ʱiָ���� '.', ������Ҫi++
            i++;
            B = scanUnsignedInteger(s);
        } 
        
        //�ж��Ƿ���C
        if(i < s.length() && (s.charAt(i) == 'e' || s.charAt(i) == 'E')){
            i++;
            C = scanInteger(s);
            //�������e||E, ����û��C, ˵����������,ֱ�ӷ���
            if(!C)
                return false;
        }   
        //�ߵ�����˵��C�ϸ�, ֻ���ж�A��B�����
        //i����ɨ���������ַ��� && (��A�Ļ�,��û��B������; û��A�Ļ�, ������B)
        return i == s.length() && (A || B);
    }

    //ɨ������
    boolean scanInteger(String s){
        //�ж��Ƿ���'+'||'-'
        if(i<s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-' ))
            i++;
        //ɨ���޷�����������
        return scanUnsignedInteger(s);
    }
    //ɨ���޷�����������
    boolean scanUnsignedInteger(String s){
        int start = i;
        while(i < s.length() && s.charAt(i) >= '0' &&  s.charAt(i) <= '9'){
            i++;
        }
        //��i>start, ˵��ɨ�赽������
        //��i <= start ˵��û��ɨ�赽����, �������˵��ҪôstartԽ��, Ҫôs.charAt(start)��������
        return i > start;
    }
}