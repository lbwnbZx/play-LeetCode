//ʱ�临�ӶȲ�����Ҫ��    O(m+n)
import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length + nums2.length;
        int  num[]=new int[len];
        int index=0;//��¼�������±�
        //�����������Ϊһ����������
        for(int i=0;i<nums1.length;i++){
            num[index]=nums1[i];
            index++;
        }
        for(int i=0;i<nums2.length;i++){
            num[index]=nums2[i];
            index++;
        }
        
        //��������
        Arrays.sort(num);
        double  result=0;
        
        //������λ��
        if(len%2==0){
            result=(double)(num[len/2-1]+num[len/2])/2;//���鳤�ȱ��±��1 ������len/2-1
        }else{
            result=(double)num[len/2];
        }
            
        return result;
    }
}