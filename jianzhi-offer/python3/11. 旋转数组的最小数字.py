class Solution:
    def minArray(self, numbers: List[int]) -> int:
        l,r = 0,len(numbers)-1
        while l < r:
            m = (l+r)//2 #向下取整
            if(numbers[m] > numbers[r]):
                l=m+1
            elif(numbers[m]<numbers[l]):
                r=m
            else:
                r-=1

        return numbers[r]                
