/*ì³²¨ÄÇÆõÊıÁĞ
*/
class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0,b=1;
        int num=0;
        for(int i=2;i<=n;i++){
            num=a+b;
            if(num >= 1000000007){
                num = num - 1000000007;
            }
            a=b;
            b=num;    
        }
        return num;

    }
}