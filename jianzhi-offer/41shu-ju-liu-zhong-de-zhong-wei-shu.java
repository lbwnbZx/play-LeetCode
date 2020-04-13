/*
�ô�С��
������鳤��Ϊ��������λ�������м���Ǹ����������Ϊż�����м�ƫ����Ǹ�Ԫ��
ʹ���������洢���ڻ�С����λ����ֵ��ֻ��pollһ�ξͿɵ�����ǰ����λ����ʹ����С�����洢������λ����ֵ��
������Ҫ����������ƽ�⣬��Ϊ����Ҫ�����λ�����������ѵĴ�С��ʼ�յ��ڻ����С�ѵĴ�С��1,����ƽ��ͺ�
*/
class MedianFinder {
    private PriorityQueue<Integer> maxHeap, minHeap;

    /** initialize your data structure here. */
    public MedianFinder() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        maxHeap.offer(num);//�󶥶�
        minHeap.offer(maxHeap.poll());
        if(minHeap.size()>maxHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size() == maxHeap.size())
            //ע��peek��poll������
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