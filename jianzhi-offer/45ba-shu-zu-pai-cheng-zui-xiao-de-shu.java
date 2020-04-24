class Solution {
    public String minNumber(int[] nums) {
        String []strs= new String[nums.length];
        for(int i=0;i<nums.length;i++){
            strs[i]=String.valueOf(nums[i]);
        }
        fastSort(strs,0,strs.length-1);
        StringBuilder res = new StringBuilder();
        for(String s:strs){
            res.append(s);
        }
        return res.toString();
    }
    //����
    private void fastSort(String[] strs,int l,int r){
        if(l>=r) return;
        int i=l,j=r;
        String tmp = strs[l];//��׼λ
        while(i<j){
            //�ȿ��ұߣ���������ݼ�
            while(i<j&&(strs[j]+strs[l]).compareTo(strs[l]+strs[j])>=0) j--;
            //�ٿ���ߣ��������ҵ���
            while(i<j&&(strs[i]+strs[l]).compareTo(strs[l]+strs[i])<=0) i++;
            
            //���������ͽ���
            tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
        }
        //��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
        strs[i] = strs[l];
        strs[l] = tmp;

        fastSort(strs, l, i - 1);
        fastSort(strs, i + 1, r);
     }
}