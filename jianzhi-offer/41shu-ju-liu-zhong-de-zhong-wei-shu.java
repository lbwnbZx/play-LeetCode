/*
用大小堆
如果数组长度为奇数，中位数是最中间的那个，如果长度为偶数是中间偏左的那个元素
使用最大堆来存储等于或小于中位数的值，只需poll一次就可弹出当前的中位数，使用最小堆来存储大于中位数的值。
此外需要保持两个堆平衡，因为我们要获得中位数，所以最大堆的大小将始终等于或比最小堆的大小大1,保持平衡就好
*/
class MedianFinder {
    private PriorityQueue<Integer> maxHeap, minHeap;

    /** initialize your data structure here. */
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxHeap.offer(num);//大顶堆
        minHeap.offer(maxHeap.poll());
        if(minHeap.size()>maxHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size() == maxHeap.size())
            //注意peek和poll的区别
            return (minHeap.peek()+maxHeap.peek())*0.5;
        else
            return maxHeap.peek();    
    }
};

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder* obj = new MedianFinder();
 * obj->addNum(num);
 * double param_2 = obj->findMedian();
 */