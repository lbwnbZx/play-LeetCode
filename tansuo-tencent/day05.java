class Solution {
   public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        if(len==0){
            return "";
        }
        String pre=strs[0];
        for(int i=1;i<len;i++){//�����ǵڼ����ַ���
            int j=0;
            for(;j<strs[i].length()&&j<pre.length();j++){//���Ƶ�i���ַ����ĵ�i������
                if(pre.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }

            pre=pre.substring(0,j);
            if(pre.equals("")){
                return pre;
            }
        }
        return pre;
    }
}