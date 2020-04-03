/*替换空格
请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
*/
class Solution {
    public String replaceSpace(String s) {
        int len=s.length();
        char []array=new char[len*3];
        int size=0;
        for(int i=0;i<len;i++){
            char c=s.charAt(i);
            if(c==' '){
                array[size++]='%';
                array[size++]='2';
                array[size++]='0';
            }else{
                array[size++]=c;
            }
        }
        String str=new String(array,0,size);
        return str;
    }
}