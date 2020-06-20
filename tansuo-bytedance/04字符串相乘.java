class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0")||num2.equals("0")) return "0";
        
        int len1=num1.length(),len2=num2.length();
        int []arrayInt=new int[len1+len2];//存储计算后的int类型的值
        
        for(int i=len1-1;i>=0;i--){
            for(int j=len2-1;j>=0;j--){
                int n1=num1.charAt(i)-'0';
                int n2=num2.charAt(j)-'0';
                
                arrayInt[i+j]+=n1*n2;
                
                //进位
                if(arrayInt[i+j]>=10&&i+j!=0){
                    arrayInt[i+j-1]+=arrayInt[i+j]/10;
                    arrayInt[i+j]=arrayInt[i+j]%10;
                }                
                
            }
        }
        
        StringBuffer res = new StringBuffer();
        
        for(int i=0;i<len1+len2-1;i++){
            res.append(arrayInt[i]);
        }
        
        return res.toString();
    }
}