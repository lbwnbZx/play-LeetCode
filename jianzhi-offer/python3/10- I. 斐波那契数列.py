class Solution:
    def fib(self, n: int) -> int:
        a,b = 0,1
        for _ in range(n): # 只做n次循环
            a,b = b,a+b # 相当于java中申请一个零时变量temp交换a和b
        return a % 1000000007

        
