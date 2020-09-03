class Solution:
    def firstUniqChar(self, s: str) -> str:
        dic = {} # 一个字典
        for c in s :
            dic[c] = not c in dic
        for c in s :
            if dic[c]:  return c     
        return ' '
