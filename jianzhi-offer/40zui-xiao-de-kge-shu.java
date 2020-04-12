/*
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        // ����
        Arrays.sort(arr);
        // ����ǰk����
        return Arrays.copyOfRange(arr, 0, k);   
    }
}
*/

/*
//������
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0 || arr.length == 0) return new int[0];
        //ʹ��һ���󶥶�
        //java��PriorityQueueĬ����С���ѣ����comparator����ʹ���ɴ󶥶�
        Queue<Integer> heap = new PriorityQueue<>(k,(i1,i2)->Integer.compare(i2,i1));
        for(int e : arr){
            //��ǰ����С�ڶѶ�Ԫ�زŻ����
            if(heap.isEmpty() || heap.size() < k || e<heap.peek()){
                heap.offer(e);
            }
            if(heap.size() > k){
                heap.poll();//ɾ���Ѷ����Ԫ��
            }
        }
        //������Ԫ�ش�������
        int[] res = new int[k];
        int j=0;
        for(int e: heap){
            res[j++]=e;
        }
        return res;
    }
}

*/

/*
���ű���
����˼���ǿ�����������һ������Ҫ�Ĳ����� partition�����֣��������������ѡȡһ����ŦԪ�� v��Ȼ��ԭ���ƶ������е�Ԫ�أ�ʹ�ñ� v С��Ԫ���� v ����ߣ��� v ���Ԫ���� v ���ұߡ�
��� partition ������ԭ�ؽ��еģ���Ҫ O(n) ��ʱ�䣬�����������������ݹ������������������顣������ѡ��quick select���㷨�Ĳ�֮ͬ�����ڣ�������ֻ��Ҫ�ݹ��ѡ��һ������顣����ѡ���㷨�뵱��һ��������ȫ���Ŀ���������Ϊ����ֻ��Ҫ֪����С�� k ��������Щ��������Ҫ֪�����ǵ�˳��
���ǵ�Ŀ����Ѱ����С�� k ���������辭��һ�� partition ��������ŦԪ��λ���±� m��Ҳ����˵������������ m ��Ԫ�أ���ԭ��������С��m ��������ô��
�� k = m�����Ǿ��ҵ�����С�� k �����������������飻
�� k<m ������С�� k ����һ��������������У�����ֻ��Ҫ���������ݹ�� partition ���ɣ�
�� k>m������������е� m������������С�� k ���������ǻ���Ҫ���Ҳ�������Ѱ����С�� k-m ���������Ҳ�����ݹ�� partition ���ɡ�
*/
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0 || arr.length == 0){
            return new int[0];
        } else if(k >= arr.length){
            return arr;
        }
        //ԭ�ز��ϻ�������
        partitionArray(arr,0,arr.length-1,k);
        //�����ǰk����������С��k�������������
        int res[] =new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr[i];

        }
        return res;
    }
    private void partitionArray(int[] arr,int lo,int hi,int k){
        //��һ��partition����
        int m = partition(arr,lo,hi);
        //��ʱ�����ǰm����������С��m����
        if(m==k){
            return;
        }else if(k<m){
            //��С��k������ǰm�����У��ݹ黮��
            partitionArray(arr,lo,m-1,k);
        }else{
            // ���Ҳ�������Ѱ����С�� k-m ����
            partitionArray(arr, m+1, hi, k);
        }
    }
    //�����з֣������±�j��ʹ�ñ�arr[j]С��������j����ߣ���arr[j]����������ұ�
    private int partition(int []arr,int lo,int hi){
        int i=lo;
        int j=hi+1;
        int v=arr[lo];
        while(true){
            while(++i<=hi&&arr[i]<v);
            while(--j>=lo&&arr[j]>v);
            if(i>=j) break;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        arr[lo]=arr[j];
        arr[j]=v;
        return j;

    }
}
