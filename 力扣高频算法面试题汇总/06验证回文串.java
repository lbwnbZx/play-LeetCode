class Solution {
    public boolean isPalindrome(String s) {
        char []c = s.toLowerCase().toCharArray(); //toLowerCase()将大写字母转化为小写
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<c.length;i++){
            sb.append(onlyNumAndAlphabet(c[i]));      
        }//此时sb内只有数字和小写字母
        
        return validate(sb.toString().toCharArray());

    }
    
    
    //将字符串中的非数字和非字母去掉
    public String onlyNumAndAlphabet(char c){
        StringBuffer temp = new StringBuffer();
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
            temp.append(c);
        }
        return temp.toString(); 
    }
    
    //判断是否为回文串
    public boolean validate(char []c){
        int left = 0,right = c.length-1;
        while(left <= right){
            if(c[left++] != c[right--]) return false;
        }
        return true;
    }
}
