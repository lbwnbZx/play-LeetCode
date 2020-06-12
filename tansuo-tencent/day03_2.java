class Solution {
    public String longestPalindrome(String s) {
        if(s.equals("")){
           return "";
        }  
        String origin=s;//������ַ���
        String reverse=new StringBuffer(s).reverse().toString();
        int len=s.length();
        int [][]arr=new int[len][len];//�������湫���ַ����ĳ���
        int maxLen=0;//�洢��󳤶�
        int maxEnd=0;//�洢�����Ӵ��Ľ�β�ַ��±�
        
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(origin.charAt(i)==reverse.charAt(j)){
                    if(i==0||j==0){
                        arr[i][j]=1;
                    }else{
                        arr[i][j]=arr[i-1][j-1]+1;
                    }
                }
                //������󳤶�
                if(arr[i][j]>maxLen){//i,jָ���Ӵ���ĩβ�ַ�
                    int beforeRev=len-1-j;//���ú���Ĵ�ĩλ�ַ���Ӧδ���û��Ĵ�����ʼ�±�
                    if(beforeRev+arr[i][j]-1==i){
                        maxLen=arr[i][j];
                        maxEnd=i;//��iλ�ý�β���ַ��±�
  
                    }
                }
                
            }
        }
        return s.substring(maxEnd-maxLen+1,maxEnd+1);//substring��ȡ���ַ�����������ʼ��������������������
    }
}