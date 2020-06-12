class Solution {
    public String longestPalindrome(String s) {
        if(s.equals("")){
           return "";
        }  
        String origin=s;//最初的字符串
        String reverse=new StringBuffer(s).reverse().toString();
        int len=s.length();
        int [][]arr=new int[len][len];//用来保存公共字符串的长度
        int maxLen=0;//存储最大长度
        int maxEnd=0;//存储回文子串的结尾字符下标
        
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(origin.charAt(i)==reverse.charAt(j)){
                    if(i==0||j==0){
                        arr[i][j]=1;
                    }else{
                        arr[i][j]=arr[i-1][j-1]+1;
                    }
                }
                //更新最大长度
                if(arr[i][j]>maxLen){//i,j指向子串的末尾字符
                    int beforeRev=len-1-j;//倒置后回文串末位字符对应未倒置回文串的起始下标
                    if(beforeRev+arr[i][j]-1==i){
                        maxLen=arr[i][j];
                        maxEnd=i;//以i位置结尾的字符下标
  
                    }
                }
                
            }
        }
        return s.substring(maxEnd-maxLen+1,maxEnd+1);//substring截取子字符串，包括起始索引，不包括结束索引
    }
}