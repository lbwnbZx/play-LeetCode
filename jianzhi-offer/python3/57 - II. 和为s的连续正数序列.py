# 滑动窗口
# ij只能往右边移动
# 左闭右开
class Solution:
    def findContinuousSequence(self, target: int) -> List[List[int]]:
        i, j = 1, 1  # 滑动窗口的左右边界
        sum = 0
        res = []

        while  i <= target // 2:
            if sum  < target: 
                sum += j
                j += 1
            elif sum > target:
                sum -= i
                i += 1
            else:
                tmp = list(range(i, j))
                res.append(tmp)
                # 左边界右移，寻找下一个序列
                sum -=i
                i += 1

        return res         
