class MedianFinder:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.A = [] # 小顶堆，存储较大的一半
        self.B = [] # 大顶堆，存储较小的一半

    def addNum(self, num: int) -> None:
        # m，n分别为A，B的元素个数,N=m+n
        # 当m=n时，N为偶数，需要向A中加一个元素。将新元素添加到B中，再将B的堆顶元素加到A中
        # 当m!=n时，N为奇数，需要向B中加一个元素。将新元素添加到A中，再将A的堆顶元素加到B中
        if len(self.A) != len(self.B):
            # Python 中 heapq 模块是小顶堆。实现大顶堆方法：小顶堆的插入和弹出操作均将元素取反即可。
            heappush(self.A,num)
            heappush(self.B,-heappop(self.A))
        else:
            heappush(self.B,-num)    
            heappush(self.A, -heappop(self.B))

    def findMedian(self) -> float:
        return self.A[0] if len(self.A) != len(self.B) else (self.A[0]-self.B[0])/2.0


# Your MedianFinder object will be instantiated and called as such:
# obj = MedianFinder()
# obj.addNum(num)
# param_2 = obj.findMedian()
