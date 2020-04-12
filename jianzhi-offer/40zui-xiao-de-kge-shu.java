/*
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        // 排序
        Arrays.sort(arr);
        // 返回前k个数
        return Arrays.copyOfRange(arr, 0, k);   
    }
}
*/

/*
//堆排序
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0 || arr.length == 0) return new int[0];
        //使用一个大顶堆
        //java的PriorityQueue默认是小顶堆，添加comparator参数使其变成大顶堆
        Queue<Integer> heap = new PriorityQueue<>(k,(i1,i2)->Integer.compare(i2,i1));
        for(int e : arr){
            //当前数字小于堆顶元素才会入堆
            if(heap.isEmpty() || heap.size() < k || e<heap.peek()){
                heap.offer(e);
            }
            if(heap.size() > k){
                heap.poll();//删除堆顶最大元素
            }
        }
        //将堆中元素存入数组
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
快排变形
快排思想是快速排序中有一步很重要的操作是 partition（划分），从数组中随机选取一个枢纽元素 v，然后原地移动数组中的元素，使得比 v 小的元素在 v 的左边，比 v 大的元素在 v 的右边。
这个 partition 操作是原地进行的，需要 O(n) 的时间，接下来，快速排序会递归地排序左右两侧的数组。而快速选择（quick select）算法的不同之处在于，接下来只需要递归地选择一侧的数组。快速选择算法想当于一个“不完全”的快速排序，因为我们只需要知道最小的 k 个数是哪些，并不需要知道它们的顺序。
我们的目的是寻找最小的 k 个数。假设经过一次 partition 操作，枢纽元素位于下标 m，也就是说，左侧的数组有 m 个元素，是原数组中最小的m 个数。那么：
若 k = m，我们就找到了最小的 k 个数，就是左侧的数组；
若 k<m ，则最小的 k 个数一定都在左侧数组中，我们只需要对左侧数组递归地 partition 即可；
若 k>m，则左侧数组中的 m个数都属于最小的 k 个数，我们还需要在右侧数组中寻找最小的 k-m 个数，对右侧数组递归地 partition 即可。
*/
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k == 0 || arr.length == 0){
            return new int[0];
        } else if(k >= arr.length){
            return arr;
        }
        //原地不断划分数组
        partitionArray(arr,0,arr.length-1,k);
        //数组的前k个数就是最小的k个数，将其输出
        int res[] =new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr[i];

        }
        return res;
    }
    private void partitionArray(int[] arr,int lo,int hi,int k){
        //做一次partition操作
        int m = partition(arr,lo,hi);
        //此时数组的前m个数就是最小的m个数
        if(m==k){
            return;
        }else if(k<m){
            //最小的k个数在前m个数中，递归划分
            partitionArray(arr,lo,m-1,k);
        }else{
            // 在右侧数组中寻找最小的 k-m 个数
            partitionArray(arr, m+1, hi, k);
        }
    }
    //快排切分，返回下标j，使得比arr[j]小的数都在j的左边，比arr[j]大的数都在右边
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
