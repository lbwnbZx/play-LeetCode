class Solution {
    public int[] constructArr(int[] a) {
        int len = a.length;
        int res[]=new int[len];
        //�ȳ���ߵ���
        for(int i=0,product=1;i<len;i++){
            res[i]=product;
            product*=a[i];
        }
        //�ٳ��ұߵ���
        for(int i=len-1,product=1;i>=0;i--){
            res[i]*=product;
            product*=a[i];
        }
        return res;
    }
}

