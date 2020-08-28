class Solution:
    def findNthDigit(self, n: int) -> int:
        digit, start, count =1, 1, 9

        # 确定n所在数字的数位
        while n > count : 
            n -= count
            start *= 10
            digit += 1
            count = 9 * start * digit
        # 确定n所在的数字
        num = start + (n - 1) // digit
        # 确定n在的num的哪一数位
        return int(str(num)[(n - 1) % digit])
