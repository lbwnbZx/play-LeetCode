package 日常测试;
/*请你来实现一个 atoi 函数，使其能将字符串转换成整数。
首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；假如第一个非空字符是数字，
则直接将其与之后连续的数字字符组合起来，形成整数。

该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
在任何情况下，若函数不能进行有效的转换时，请返回 0。
假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [?231,  231 ? 1]。如果数值超过这个范围，请返回  INT_MAX (231 ? 1) 或 INT_MIN (?231) 。*/

public class Solution06 {
    /*public static int myAtoi(String str) {
        int value=0;//存储转换的整数
        int sign=0;//符号  1表示+，-1表示-
        int len=str.length();
        int isNum=0;//判断是否为数字位


       // str=str.trim();//丢掉无用的开头空格字符    trim删除字符串首尾的空格字符
        if(str==null||len==0){
            return 0;
        }

        for(int i=0;i<len;++i){
          char  temp=str.charAt(i);
            if(isNum==0){
                if(temp==' ')//空格跳过
                    continue;
                else if(temp=='+'){
                    sign = 1;
                }else if(temp=='-'){
                    sign = -1;
                }else if(temp>='0' && temp<='9'){
                    value = value*10 + (int) (temp-'0');
                }else{//其他情况直接返回0
                    return 0;
                }
                isNum = 1;//进入数字识别

            }else{
                if(temp>='0'&&temp<='9'){
                    //判断越界问题
                    if(sign==1 && (value>Integer.MAX_VALUE/10 || (value==Integer.MAX_VALUE/10 && temp>'7')))
                        return Integer.MAX_VALUE;
                    if(sign==-1 && (value>Integer.MAX_VALUE/10 || (value==Integer.MAX_VALUE/10 && temp>'8')))
                        return Integer.MIN_VALUE;
                    value=value*10+(int)(temp-'0');
                }else{//不是数字位，结束
                    return sign*value;
                }
            }

        }
        return sign*value;
    }*/

    public static int myAtoi(String str) {
        int len = str.length();
        int isNum = 0;//判断是否进入数字识别
        int flag = 1;//存储结果的正负
        int ans = 0;//存储结果

        for(int i=0;i<len;i++){
            char temp = str.charAt(i);
            if(isNum==0){
                if(temp==' ')//空格跳过
                    continue;
                else if(temp=='+'){
                    flag = 1;
                }else if(temp=='-'){
                    flag = -1;
                }else if(temp>='0' && temp<='9'){
                    ans = ans*10 + (int) (temp-'0');
                }else{//其他情况直接返回0
                    return 0;
                }
                isNum = 1;//进入数字识别
            }
            else{
                if(temp>='0' && temp<='9'){//进入数字识别后识别到的是数字，继续
                    //判断越界情况
                    //这里是判断正数越界
                    if(flag==1 && (ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && temp>'7')))
                        return Integer.MAX_VALUE;
                    //这里是判断负数越界。
                    if(flag==-1 && (ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && temp>'8')))
                        return Integer.MIN_VALUE;
                    ans = ans*10 + (int) (temp-'0');
                }else{//识别的不是数字，直接返回结果
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
